package com.example.recycleview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.DinosaurioDetailActivity;
import com.example.recycleview.R;
import com.example.recycleview.models.Dinosaurio;

import java.util.List;

public class DinosaurioAdapter extends RecyclerView.Adapter<DinosaurioAdapter.DinosaurioViewHolder> {
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

        holder.itemView.setOnClickListener(v -> {
            Context context = v.getContext();
            Dinosaurio dino = dinosaurioslista.get(position);

            Intent intent = new Intent(context, DinosaurioDetailActivity.class);
            intent.putExtra("nombre", dino.getNombre());
            intent.putExtra("tipo", dino.getTipo());
            intent.putExtra("descripcion", dino.getDescripcion());
            intent.putExtra("imagen", dino.getImagen());

            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return dinosaurioslista.size();
    }

    public static class DinosaurioViewHolder extends RecyclerView.ViewHolder {
        TextView txtnombre, txttipo, txtdescripcion;
        ImageView imgdino;

        public DinosaurioViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.txtnombre);
            txttipo = itemView.findViewById(R.id.txttipo);
            txtdescripcion = itemView.findViewById(R.id.txtdescripcion);
            imgdino = itemView.findViewById(R.id.imgdino);
        }

        public void setData(Dinosaurio dinosaurio) {
            txtnombre.setText(dinosaurio.getNombre());
            txttipo.setText(dinosaurio.getTipo());
            txtdescripcion.setText(dinosaurio.getDescripcion());
            imgdino.setImageResource(dinosaurio.getImagen());
        }
    }
}
