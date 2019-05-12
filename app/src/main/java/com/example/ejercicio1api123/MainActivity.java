package com.example.ejercicio1api123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText a,b,c,d;
Button boton;
RadioGroup ra,rb;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        d=findViewById(R.id.d);
        boton=findViewById(R.id.boton);
        ra=findViewById(R.id.ra);
        rb=findViewById(R.id.rb);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId1;
                int selectedId2;
                String nom = a.getText().toString();
                String user = b.getText().toString();
                String pass = c.getText().toString();
                String passC = d.getText().toString();


                selectedId1 = ra.getCheckedRadioButtonId();
                selectedId2 = rb.getCheckedRadioButtonId();

                RadioButton radioButton = (RadioButton) findViewById(selectedId1);
                RadioButton radioButton2 = (RadioButton) findViewById(selectedId2);

                Intent intent = new Intent(MainActivity.this,mostrados.class);
                if(nom.equals("")){
                    Toast.makeText(MainActivity.this,"Ingresar Nombre",Toast.LENGTH_SHORT).show();
                }else if(user.equals("")){
                    Toast.makeText(MainActivity.this,"Ingresar Usuario",Toast.LENGTH_SHORT).show();
                }else if(pass.equals("")){
                    Toast.makeText(MainActivity.this,"Ingresar Contraseña",Toast.LENGTH_SHORT).show();
                }else if(selectedId1==-1){
                    Toast.makeText(MainActivity.this,"Seleccione su género",Toast.LENGTH_SHORT).show();
                }else if(selectedId2==-1){
                    Toast.makeText(MainActivity.this,"Seleccione su categoría",Toast.LENGTH_SHORT).show();
                } else if(pass.equals(passC)){
                    intent.putExtra("nombre", a.getText().toString());
                    intent.putExtra("user", b.getText().toString());
                    intent.putExtra("sexo", radioButton.getText().toString());
                    intent.putExtra("categoria", radioButton2.getText().toString());
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this,"Las contraseñas no coinciden",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
