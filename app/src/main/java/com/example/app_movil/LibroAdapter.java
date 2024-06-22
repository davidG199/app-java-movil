package com.example.app_movil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.app_movil.retrofit.modelos.libro;
import java.util.List;

public class LibroAdapter extends RecyclerView.Adapter<LibroAdapter.LibroViewHolder> {

    private List<libro> libros;

    public LibroAdapter(List<libro> libros){
        this.libros = libros;
    }

    @NonNull
    @Override
    public LibroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_libro, parent, false);
        return new LibroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LibroViewHolder holder, int position) {
        libro libro = libros.get(position);
        holder.tituloLibro.setText(libro.getTitulo());

        // Usa Glide para cargar la imagen
        Glide.with(holder.itemView.getContext())
                .load("http://127.0.0.1:8000" + libro.getImagePath())
                .into(holder.imagenLibro);
    }

    @Override
    public int getItemCount() {
        return libros.size();
    }

    static class LibroViewHolder extends RecyclerView.ViewHolder {
        ImageView imagenLibro;
        TextView tituloLibro;

        LibroViewHolder(View itemView) {
            super(itemView);
            imagenLibro = itemView.findViewById(R.id.imagenLibro);
            tituloLibro = itemView.findViewById(R.id.tituloLibro);
        }
    }

    
}
