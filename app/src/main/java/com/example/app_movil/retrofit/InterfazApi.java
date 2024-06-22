package com.example.app_movil.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


import com.example.app_movil.retrofit.modelos.libro;

public interface InterfazApi {

    //interfaz para consumir los endpoints de la api

    //endpoints para los libros
    @GET("libros.json")
    Call<List<libro>> obtener_libros();


}
