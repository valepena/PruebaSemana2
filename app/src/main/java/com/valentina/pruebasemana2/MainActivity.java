package com.valentina.pruebasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nombre,telefono,email,descripcion;
    Button siguiente;
    DatePicker fecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.tvNombre);
        fecha = findViewById(R.id.datepicker);
        telefono = findViewById(R.id.tvTelefono);
        email = findViewById(R.id.tvEmail);
        descripcion = findViewById(R.id.tvDescripcion);
        siguiente = findViewById(R.id.botonSiguiente);

        nombre.setText(getIntent().getStringExtra("tvNombre"));
        telefono.setText(getIntent().getStringExtra("tvTelefono"));
        email.setText(getIntent().getStringExtra("tvEmail"));
        descripcion.setText(getIntent().getStringExtra("tvDescripcion"));

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!nombre.getText().toString().isEmpty()&&!telefono.getText().toString().isEmpty()&&!email.getText().toString().isEmpty())
                {
                    Intent registrado = new Intent(MainActivity.this, MainActivity2.class);
                    registrado.putExtra("tvnombre",nombre.getText().toString());
//                  se le suma uno al mes, dato que estos empiezan en 0
                    registrado.putExtra("datepicker",String.valueOf(fecha.getMonth()+1)+'-'+(fecha.getDayOfMonth())+'-'+(fecha.getYear()));
                    registrado.putExtra("tvTelefono",telefono.getText().toString());
                    registrado.putExtra("tvEmail",email.getText().toString());
                    registrado.putExtra("tvDescripcion",descripcion.getText().toString());
                    startActivity(registrado);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Debe ingresar todos los datos",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}