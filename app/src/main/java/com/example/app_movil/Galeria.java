package com.example.app_movil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_movil.retrofit.InterfazApi;
import com.example.app_movil.retrofit.modelos.libro;
import com.example.app_movil.retrofit.retrofitConfig;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Galeria extends AppCompatActivity {

    private InterfazApi interfazApi;
    private RecyclerView recyclerViewLibros;
    private LibroAdapter libroAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        //configurar retrofit
        Retrofit retrofit = retrofitConfig.getInstancia("http://127.0.0.1:8000/");
        interfazApi = retrofit.create(InterfazApi.class);

        //iniziar RecyclerView
        recyclerViewLibros = findViewById(R.id.recyclerViewLibros);
        recyclerViewLibros.setLayoutManager(new LinearLayoutManager(this));

        //botones de navegacion
        Button btnInicio = findViewById(R.id.btnInicio);
        btnInicio.setOnClickListener(v -> {
            Intent intent = new Intent(Galeria.this, MainActivity.class);
            startActivity(intent);
        });

        Button  btnContacto = findViewById(R.id.btnContacto);
        btnContacto.setOnClickListener(v -> {
            Intent intent = new Intent(Galeria.this, MainActivity.class);
            startActivity(intent);
        });
    getLibros();
    }

    private void getLibros() {
        interfazApi.obtener_libros().enqueue(new Callback<List<libro>>() {
            //si la peticion obtiene una respuesta
            @Override
            public void onResponse(@NonNull Call<List<libro>> call, @NonNull Response<List<libro>> response) {
                Log.d("galeria", response.body().toString());
                //si la respuesta es correcta (ok)
                if (response.isSuccessful() && response.body() != null) {
                    List<libro> libros = response.body();
                    libroAdapter = new LibroAdapter(libros);
                    recyclerViewLibros.setAdapter(libroAdapter);
                    Log.d("log", response.body().toString());
                    Log.d("galeria", "libros obtenidos" + libros.toString());
                } else //si la respuesta es diferente de ok
                {
                    Toast.makeText(Galeria.this, "Error al obtener los libros", Toast.LENGTH_SHORT).show();
                    Log.e("error", "Error en la respuesta: " + response.message());
                }
            }
            //si no obtiene respuesta
            @Override
            public void onFailure(@NonNull Call<List<libro>> call, @NonNull Throwable t) {
                Toast.makeText(Galeria.this, "Error de la api: " + t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.e("error", "Error de la API: ", t);
            }
        });
    }
}
//<!--CODIGO ACTUALIZADO-->