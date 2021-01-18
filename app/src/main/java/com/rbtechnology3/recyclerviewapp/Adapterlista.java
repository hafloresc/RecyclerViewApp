package com.rbtechnology3.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapterlista extends RecyclerView.Adapter<Adapterlista.ViewHolderlista> {

    ArrayList<elementos> listadeelementos;

    public Adapterlista(ArrayList<elementos> listadeelementos){
        this.listadeelementos= listadeelementos;
    }

    @NonNull
    @Override
    public ViewHolderlista onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlista,null, false);
        return new ViewHolderlista(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderlista holder, int position) {
        holder.Edescripcion.setText(listadeelementos.get(position).getDescripcion());
        holder.Etitulo.setText(listadeelementos.get(position).getTitulo());
        holder.foto.setImageResource(listadeelementos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listadeelementos.size();
    }

    public class ViewHolderlista extends RecyclerView.ViewHolder {

        TextView Etitulo,Edescripcion;
        ImageView foto;
        public ViewHolderlista(@NonNull View itemView) {
            super(itemView);

            Etitulo=(TextView)itemView.findViewById(R.id.idTextViewlista);
            Edescripcion=(TextView)itemView.findViewById(R.id.idTextViewDescripcionlista);
            foto=(ImageView)itemView.findViewById(R.id.idImageViewlista);

        }
    }
}
