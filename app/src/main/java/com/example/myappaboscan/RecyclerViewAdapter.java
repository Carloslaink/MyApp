package com.example.myappaboscan;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre, descripcion;
        ImageView blockimg;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre=(TextView) itemView.findViewById(R.id.idTitulo);
            descripcion=(TextView) itemView.findViewById(R.id.idDescrip);
            blockimg=(ImageView) itemView.findViewById(R.id.imgitem);

        }
    }

    public List<modelosList> listaxblock;

    public RecyclerViewAdapter(List<modelosList> listaxblock) {
        this.listaxblock = listaxblock;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrecycler,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder Holder, int position) {
        Holder.nombre.setText(listaxblock.get(position).getNombre());
        Holder.descripcion.setText(listaxblock.get(position).getDescripcion());
        Holder.blockimg.setImageResource(listaxblock.get(position).getBlockimg());
    }

    @Override
    public int getItemCount() {
        return listaxblock.size();
    }
}
