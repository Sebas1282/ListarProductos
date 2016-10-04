package com.example.juansebastian.listarproductos;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.juansebastian.entidades.Producto;

import java.util.List;

/**
 * Created by JuanSebastian on 24/09/16.
 */
public class ProductoAdapter extends BaseAdapter {
    private  final Activity actividad;
    public List<Producto> lista;

    public List<Producto> getLista() {
        return lista;
    }

    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }

    public ProductoAdapter(Activity actividad) {
        this.actividad = actividad;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
        return lista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = actividad.getLayoutInflater();
        View vista = inflater.inflate(R.layout.elemento_producto,null,true);

        TextView txtIdProd= (TextView)vista.findViewById(R.id.txtCodigo);
        txtIdProd.setText(lista.get(position).getIdProducto().toString());

        TextView txtNombre= (TextView)vista.findViewById(R.id.txtNombre);
        txtNombre.setText(lista.get(position).getIdProducto().toString());
        return vista;
    }
}
