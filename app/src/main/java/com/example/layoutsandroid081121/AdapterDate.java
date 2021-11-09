package com.example.layoutsandroid081121;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDate extends RecyclerView.Adapter<AdapterDate.ViewHolderDatos> {

    ArrayList<Desing> Acomodo;

    public AdapterDate(ArrayList<Desing> acomodo) {
        this.Acomodo = acomodo;
    }

    @NonNull
    @Override
    public AdapterDate.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int layout=0;
        if (com.example.layoutsandroid081121.Acomodo.visualization== com.example.layoutsandroid081121.Acomodo.list){
            layout= R.layout.design;
            //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design,null,false);

        }else{
            layout = R.layout.cuadriculas;
            //View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cuadriculas,null,false);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(layout,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDate.ViewHolderDatos holder, int position) {
        holder.title.setText(Acomodo.get(position).getTitle());
        holder.precio.setText(Acomodo.get(position).getPrecio());
        holder.description.setText(Acomodo.get(position).getDescription());
        holder.image.setImageResource(Acomodo.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return Acomodo.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        TextView precio;
        ImageView image;

        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            title= itemView.findViewById(R.id.txtTitle);
            description= itemView.findViewById(R.id.txtDescription);
            precio= itemView.findViewById(R.id.txtPrecio);
            image = itemView.findViewById(R.id.img_icon);

        }
    }
}