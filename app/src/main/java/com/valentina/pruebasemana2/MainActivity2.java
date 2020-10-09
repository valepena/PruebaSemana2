package com.valentina.pruebasemana2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nombre, telefono, email, descripcion;
    Button editar;
    TextView fecha;

    Intent intent = new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre      = findViewById(R.id.tvNombreIngresado);
        fecha       = findViewById(R.id.tvFechaIngresado);
        telefono    = findViewById(R.id.tvTelefonoIngresado);
        email       = findViewById(R.id.tvEmailIngresado);
        descripcion = findViewById(R.id.tvDescripcionIngresado);
        editar      = findViewById(R.id.botonEditar);

        nombre.setText(getIntent().getStringExtra("tvNombre"));
        fecha.setText(getIntent().getStringExtra("datepicker"));
        telefono.setText(getIntent().getStringExtra("tvTelefono"));
        email.setText(getIntent().getStringExtra("tvEmail"));
        descripcion.setText(getIntent().getStringExtra("tvDescripcion"));

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity2.this, MainActivity.class);
                retenerdatos();
                startActivity(intent);

            }
        });

    }

    public void retenerdatos()
    {
        intent.putExtra("tvNombre", nombre.getText().toString());
        intent.putExtra("tvTelefono", telefono.getText().toString());
        intent.putExtra("tvEmail", email.getText().toString());
        intent.putExtra("tvDescripcion", descripcion.getText().toString());
    }


}