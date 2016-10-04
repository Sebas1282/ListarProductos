package com.example.juansebastian.listarproductos;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.juansebastian.entidades.Producto;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuanSebastian on 22/09/16.
 */
public class ListarProductos extends ListActivity {
    private ProductoAdapter productoAdapter;
    private List<Producto> listado = new ArrayList<>();

    //Progress Dialog Object
    ProgressDialog prgDiaglog;
    @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_productos);
        //AsyncCallWS asyn= new AsyncCallWS();
        //asyn.execute();
        productoAdapter = new ProductoAdapter(this);

        prgDiaglog = new ProgressDialog(this);
        prgDiaglog.setMessage("Por Favor Espere...");
        prgDiaglog.setCancelable(false);

        RequestParams params = new RequestParams();
        invokeWS(params);
    }
    private  class AsyncCallWS extends AsyncTask<String,Void,Void> {
        @Override
        protected Void  doInBackground(String... params){
            //invocar web service
            listado = WebService.ListarProductos("listarProductos");
            return null;
        }
        @Override
        protected void onPostExecute(Void result){
            //set response
            productoAdapter.setLista(listado);
            setListAdapter(productoAdapter);
        }

        @Override
        protected void onPreExecute(){
            //barra de progreso invisible
            //pg.setVisibility(View.VISIBLE);
        }
        @Override
        protected void onProgressUpdate(Void... values){

        }
    }
    /**
     * Method that performs RESTful webservice invocations
     *
     * @param params
     */
    public void invokeWS(RequestParams params){
        // Show Progress Dialog
        prgDiaglog.show();
        // Make RESTful webservice call using AsyncHttpClient object
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://10.0.2.2:8080/proyecto_profii/webresources/entidades.producto",params ,
                new AsyncHttpResponseHandler() {
                    // When the response returned by REST has Http response code '200'
                    @Override
                    public void onSuccess(String response) {
                        // Hide Progress Dialog

                        try {
                            // JSON Object
                            JSONArray arreglo= new JSONArray(response);


                            for(int i=0;i<arreglo.length();i++)
                            {
                                JSONObject obj = arreglo.getJSONObject(i);
                                Producto producto= new Producto();
                                producto.setNombreProducto(obj.getString("Nombre_producto"));
                                producto.setIdBodega(obj.getInt("Id_producto"));
                                producto.setPrecioCaja(obj.getDouble("Precio_Caja"));
                                producto.setPrecioPqte(obj.getDouble("Precio_Paquete"));
                                listado.add(producto);
                            }

                            productoAdapter.setLista(listado);
                            setListAdapter(productoAdapter);


                        } catch (JSONException e) {
                            // TODO Auto-generated catch block
                            Toast.makeText(getApplicationContext(), "Error Occured [Server's JSON response might be invalid]!", Toast.LENGTH_LONG).show();
                            e.printStackTrace();

                        }
                        prgDiaglog.hide();
                    }
                    // When the response returned by REST has Http response code other than '200'
                    @Override
                    public void onFailure(int statusCode, Throwable error,
                                          String content) {
                        // Hide Progress Dialog
                        prgDiaglog.hide();
                        // When Http response code is '404'
                        if(statusCode == 404){
                            Toast.makeText(getApplicationContext(), "Requested resource not found", Toast.LENGTH_LONG).show();
                        }
                        // When Http response code is '500'
                        else if(statusCode == 500){
                            Toast.makeText(getApplicationContext(), "Something went wrong at server end", Toast.LENGTH_LONG).show();
                        }
                        // When Http response code other than 404, 500
                        else{
                            Toast.makeText(getApplicationContext(), "Unexpected Error occcured! [Most common Error: Device might not be connected to Internet or remote server is not up and running]", Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }
}
