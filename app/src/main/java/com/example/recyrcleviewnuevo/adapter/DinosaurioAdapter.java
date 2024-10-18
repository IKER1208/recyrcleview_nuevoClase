package com.example.recyrcleviewnuevo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyrcleviewnuevo.R;
import com.example.recyrcleviewnuevo.models.Dinosaurio;

import java.util.List;

public class DinosaurioAdapter extends RecyclerView.Adapter<DinosaurioAdapter.DinosaurioViewHolder>{
    private List<Dinosaurio> dinosaurioslista;

    public DinosaurioAdapter(List<Dinosaurio> dinosaurioslista) {
        this.dinosaurioslista = dinosaurioslista;
    }

    @NonNull
    @Override
    public DinosaurioAdapter.DinosaurioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemdino, parent, false);

        return new DinosaurioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DinosaurioAdapter.DinosaurioViewHolder holder, int position) {
        holder.setData(dinosaurioslista.get(position));
    }

    @Override
    public int getItemCount() {
        return dinosaurioslista.size();
    }

    public class DinosaurioViewHolder extends RecyclerView.ViewHolder {
        TextView nombre, tipo, descripcion;
        ImageView imagen;
        Dinosaurio dino;

        public DinosaurioViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombre);
            tipo = itemView.findViewById(R.id.tipo);
            descripcion = itemView.findViewById(R.id.descripcion);
            imagen = itemView.findViewById(R.id.imagen);
        }

        public void setData(Dinosaurio dinosaurio) {
            dino = dinosaurio;
            nombre.setText(dino.getNombre());
            tipo.setText(dino.getTipo());
            descripcion.setText(dino.getDescripcion());
            imagen.setImageResource(dino.getImagen());
        }
    }
}
