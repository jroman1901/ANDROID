package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private EditText usuario,password;
    private Button confirmar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText)findViewById(R.id.txtusuario);
        password =(EditText) findViewById(R.id.txtpassword);
        confirmar = (Button)findViewById(R.id.btnvalidar);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usuario.getText().toString().compareTo(password.getText().toString())==0) {
                    Toast mensaje = Toast.makeText(view.getContext(), "bienvenido", Toast.LENGTH_SHORT);
                    mensaje.show();

                }
                else{
                    Toast mensaje = Toast.makeText(view.getContext(), "error al iniciar la sesión", Toast.LENGTH_SHORT);
                    mensaje.show();

                }
            }
        });



    }


}