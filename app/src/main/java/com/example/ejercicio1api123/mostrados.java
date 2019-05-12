package com.example.ejercicio1api123;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class mostrados extends AppCompatActivity {



    TextView q,w,e;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrados);

        q=findViewById(R.id.q);
        e=findViewById(R.id.e);
        w=findViewById(R.id.w);


        Bundle bundle = getIntent().getExtras();
        String nom = bundle.getString("nombre");
        String user = bundle.getString("user");
        String categoria = bundle.getString("categoria");
        String genero = bundle.getString("sexo");
        String saludo = "";
        if (genero.equals("Masculino")){
            saludo="Bienvenido";
        }else{
            saludo="Bienvenida";
        }

        
  q.setText(user);
        w.setText(categoria);
        e.setText(genero);



    }
}
