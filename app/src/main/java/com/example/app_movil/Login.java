package com.example.app_movil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

//            if (email.isEmpty() || password.isEmpty())
//                Toast.makeText(loginButton.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
//            else {
//                // Lógica de autenticación aquí
//                if (email.equals("user@example.com") && password.equals("password")) {
//                    Toast.makeText(loginButton.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
//                    // Aquí puedes agregar la lógica para redirigir a otra actividad después del inicio de sesión exitoso
//                } else {
//                    Toast.makeText(loginButton.this, "Email o contraseña incorrectos", Toast.LENGTH_SHORT).show();
//                }
//            }

        });
    }
}
//<!--CODIGO ACTUALIZADO-->