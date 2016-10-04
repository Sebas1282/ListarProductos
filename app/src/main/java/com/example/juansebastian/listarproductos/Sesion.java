package com.example.juansebastian.listarproductos;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import org.apache.http.entity.StringEntity;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.UnsupportedEncodingException;


public class Sesion extends AppCompatActivity{

    private TextView musuarioView;
    private EditText mPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_main);
        musuarioView = (TextView) findViewById(R.id.usuario_lo);
        mPasswordView = (EditText) findViewById(R.id.password);
        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id,
                                          KeyEvent keyEvent) {
                if (id == R.id.button || id == EditorInfo.IME_NULL) {
                    validarInicioSesion();
                    return true;
                }
                return false;
            }
        });

        Button mEmailSignInButton = (Button) findViewById(R.id.button);
        mEmailSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarInicioSesion();
            }
        });
    }

    private void validarInicioSesion() {
        // Reset errors. 
        musuarioView.setError(null);
        mPasswordView.setError(null);
        String email = musuarioView.getText().toString();
        String password = mPasswordView.getText().toString();
        boolean cancel = false;
        View focusView = null;
        if (TextUtils.isEmpty(password)) {
            mPasswordView.setError(getString(R.string.error_invalid_password));
            focusView = mPasswordView;
            cancel = true;
        }
        if (TextUtils.isEmpty(email)) {
            musuarioView.setError(getString(R.string.error_field_required));
            focusView = musuarioView;
            cancel = true;
        }
        if (cancel) {
            focusView.requestFocus();
        } else {
            try {
                JSONObject jsonParams = new JSONObject();
                jsonParams.put("usuario", musuarioView.getText().toString());
                jsonParams.put("contrasenia", mPasswordView.getText().toString());
                StringEntity entity = new StringEntity(jsonParams.toString());
                invokeWS(entity);
            } catch (JSONException e) {
                System.out.println("e = " + e);
            } catch (UnsupportedEncodingException w) {
                System.out.println("w = " + w);
            }
        }
    }

    public void invokeWS(StringEntity params) {
        AsyncHttpClient client = new AsyncHttpClient();
        //client.addHeader("Accept"," application/json");
        //client.addHeader("content-type"," application/json");
        client.post(getApplicationContext(), "http://10.0.2.2:8080/ArbyPlast/webresources/autenticacion" , params
                ,"application/json",new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(String response) {
                try {
                    if (response != null) {
                        JSONObject arreglo = new JSONObject(response);
                        Usuario usuario = new Usuario();
                        usuario.setNombreComplet(arreglo.getString("nombreCompleto"));
                        usuario.setId(arreglo.getString("login"));
                        vista_Registro();
                        Toast.makeText(getApplicationContext(), "Inicio Sesion  " + usuario.getNombreComplet(),
                                Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Accesos Incorrectos",
                                Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException e) {
                    Toast.makeText(getApplicationContext(),
                            "Error Occured [Server's JSON response might be invalid]!", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int statusCode, Throwable error,
                                  String content) {
                if (statusCode == 404) {
                    Toast.makeText(getApplicationContext(), "Requested resource not found",
                            Toast.LENGTH_LONG).show();
                } else if (statusCode == 500) {
                    Toast.makeText(getApplicationContext(), "Something went wrong at server end",
                            Toast.LENGTH_LONG).show();
                } else {
                    System.out.println(content);
                    Toast.makeText(getApplicationContext(), "Codigo " + statusCode + content,
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    /*
    private boolean isPasswordValid (String password){
        return password.length() > 4;
    }*/
    public void vista_Registro(){
        Intent i = new Intent(this, MainActivity.class );
        startActivity(i);
    }
    public void iniciarSesion (View view) {
        Intent intent = new Intent();
        intent.setClass(Sesion.this, ListarProductos.class);
        startActivity(intent);
    }
}