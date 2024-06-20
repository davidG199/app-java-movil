package com.example.app_movil;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulario_registro);

        EditText nombreEditText = findViewById(R.id.nombreEditText);
        EditText cedulaEditText = findViewById(R.id.cedulaEditText);
        EditText emailEditText = findViewById(R.id.emailEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        EditText confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        CheckBox termsCheckBox = findViewById(R.id.termsCheckBox);
        Button registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(v -> {
            String nombre = nombreEditText.getText().toString();
            String cedula = cedulaEditText.getText().toString();
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            String confirmPassword = confirmPasswordEditText.getText().toString();
            boolean termsAccepted = termsCheckBox.isChecked();

            if (nombre.isEmpty() || cedula.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(Registro.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(Registro.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
            } else if (!termsAccepted) {
                Toast.makeText(Registro.this, "Debes aceptar los términos y condiciones", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Registro.this, "Registro exitoso", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
//<!--CODIGO ACTUALIZADO-->