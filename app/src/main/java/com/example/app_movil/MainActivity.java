package com.example.app_movil;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegistro = findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Registro.class);
            startActivity(intent);
        });

        Button  btnGaleria = findViewById(R.id.btnGaleria);
        btnGaleria.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Galeria.class);
            startActivity(intent);
        });



    }
}
//<!--CODIGO ACTUALIZADO-->