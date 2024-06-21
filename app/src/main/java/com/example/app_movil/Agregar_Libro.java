package com.example.app_movil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Agregar_Libro extends AppCompatActivity {

    private EditText idLibroEditText, tituloEditText, autorEditText, editorialEditText, generoEditText, stockEditText;
    private ImageButton biSave, biSearch, biEdit, biDelet, biList;
    private Button btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_libro);

        // Inicializar los componentes del layout
        idLibroEditText = findViewById(R.id.idLibroEditText);
        tituloEditText = findViewById(R.id.tituloEditText);
        autorEditText = findViewById(R.id.autorEditText);
        editorialEditText = findViewById(R.id.editorialEditText);
        generoEditText = findViewById(R.id.generoEditText);
        stockEditText = findViewById(R.id.stockEditText);

        biSave = findViewById(R.id.biSave);
        biSearch = findViewById(R.id.biSearch);
        biEdit = findViewById(R.id.biEdit);
        biDelet = findViewById(R.id.biDelet);
        biList = findViewById(R.id.biList);

        btnUser = findViewById(R.id.btnUser);

        // Configurar listeners para los botones
        biSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para guardar un libro
                guardarLibro();
            }
        });

        biSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para buscar un libro
                buscarLibro();
            }
        });

        biEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para editar un libro
                editarLibro();
            }
        });

        biDelet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para eliminar un libro
                eliminarLibro();
            }
        });

        biList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para listar libros
                listarLibros();
            }
        });

        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para manejar clic en el botón de usuario
                Toast.makeText(Agregar_Libro.this, "Botón de usuario presionado", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void guardarLibro() {
        // Implementar la lógica para guardar un libro
        String id = idLibroEditText.getText().toString();
        String titulo = tituloEditText.getText().toString();
        String autor = autorEditText.getText().toString();
        String editorial = editorialEditText.getText().toString();
        String genero = generoEditText.getText().toString();
        String stock = stockEditText.getText().toString();

        // Aquí puedes agregar la lógica para guardar el libro en una base de datos o cualquier otra acción que desees realizar
        Toast.makeText(this, "Libro guardado: " + titulo, Toast.LENGTH_SHORT).show();
    }

    private void buscarLibro() {
        // Implementar la lógica para buscar un libro
        Toast.makeText(this, "Buscar libro", Toast.LENGTH_SHORT).show();
    }

    private void editarLibro() {
        // Implementar la lógica para editar un libro
        Toast.makeText(this, "Editar libro", Toast.LENGTH_SHORT).show();
    }

    private void eliminarLibro() {
        // Implementar la lógica para eliminar un libro
        Toast.makeText(this, "Eliminar libro", Toast.LENGTH_SHORT).show();
    }

    private void listarLibros() {
        // Implementar la lógica para listar libros
        Toast.makeText(this, "Listar libros", Toast.LENGTH_SHORT).show();
    }
}

//ULTIMOS CAMBIOS