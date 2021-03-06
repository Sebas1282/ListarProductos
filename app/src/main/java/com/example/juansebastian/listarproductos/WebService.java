package com.example.juansebastian.listarproductos;


import com.example.juansebastian.entidades.Producto;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class WebService {
    //Namespace of the Webservice - can be found in WSDL
    private static String NAMESPACE = "http://servicios.comunidadmascotas/";
    //Webservice URL - WSDL File location
    private static String URL = "http://192.168.43.24:8080/comunidadMascotas/WSComunidadMascotas?WSDL";
    //SOAP Action URI again Namespace + Web method name
    private static String SOAP_ACTION = "http://servicios.comunidadmascotas/";

    //private static List<HeaderProperty> headerPropertyList = new ArrayList<HeaderProperty>();

    public static String saludar(String name, String webMethName) {
        String resTxt = null;
        // Create request
        SoapObject request = new SoapObject(NAMESPACE, webMethName);
        // Property which holds input parameters
        PropertyInfo sayHelloPI = new PropertyInfo();
        // Set Name
        sayHelloPI.setName("name");
        // Set Value
        sayHelloPI.setValue(name);
        // Set dataType
        sayHelloPI.setType(String.class);
        // Add the property to request object
        request.addProperty(sayHelloPI);
        // Create envelope
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                SoapEnvelope.VER11);
        // Set output SOAP object
        envelope.setOutputSoapObject(request);
        // Create HTTP call object
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

        try {
            // Invoke web service
            androidHttpTransport.call(SOAP_ACTION + webMethName, envelope);
            // Get the response
            SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
            // Assign it to resTxt variable static variable
            resTxt = response.toString();

        } catch (Exception e) {
            //Print error
            e.printStackTrace();
            //Assign error message to resTxt
            resTxt = "Error occured";
        }
        //Return resTxt to calling object
        return resTxt;
    }

    public static List<Producto> ListarProductos(String nombreMetodo){
        List<Producto> listado = new ArrayList<>();
        SoapObject request = new SoapObject(NAMESPACE, nombreMetodo);

        // Create envelope
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                SoapEnvelope.VER11);

        // Set output SOAP object
        envelope.setOutputSoapObject(request);
        // Create HTTP call object
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

        try {
            // Invoke web service
            androidHttpTransport.call(SOAP_ACTION + nombreMetodo, envelope);
            // Get the response
            //SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
            // Assign it to resTxt variable static variable




            Vector<SoapObject> vector = (Vector<SoapObject>) envelope.getResponse();

            System.out.println("vector.toString() = " + vector.toString());
            //resTxt = response.toString();

        for (SoapObject mas:vector){
            Producto producto= new Producto(Integer.parseInt(mas.getProperty("idProducto").toString()),
                                            mas.getProperty("nombreProducto").toString(),
                                            Integer.parseInt (mas.getProperty("unidadesCaja").toString()),
                                            Integer.parseInt(mas.getProperty("unidadesPaquete").toString()),
                                            Double.parseDouble(mas.getProperty("precioPqte").toString()),
                                            Double.parseDouble(mas.getProperty("precioCaja").toString()),
                                            Integer.parseInt(mas.getProperty("idDistribuidor").toString()),
                                            Integer.parseInt(mas.getProperty("idBodega").toString()));
            listado.add(producto);
        }


        } catch (Exception e) {
            //Print error
            e.printStackTrace();
            //Assign error message to resTxt
            // resTxt = "Error occured";
        }
        //Return resTxt to calling object
        return listado;
    }
}
