package com.maydana.roman.recycleviewtiemp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TortaAdapter extends RecyclerView.Adapter<TortaAdapter.TortaViewHolder> {
    Context context;
    List<Torta> dataset;
    onTortaSelectedListener onTortaSelectedListener;
    public interface onTortaSelectedListener{
        void onTortaSelected(Torta torta);
    }
    public TortaAdapter(Context context, onTortaSelectedListener onTortaSelectedListener) {
        this.context = context;
        this.dataset = new ArrayList<>();
        this.onTortaSelectedListener = onTortaSelectedListener;
    }

    @Override
    public TortaAdapter.TortaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_torta, parent, false);
        return new TortaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TortaAdapter.TortaViewHolder holder, int position) {
        Torta torta = dataset.get(position);
        holder.nombre.setText(torta.getNombre());
        holder.imagen.setImageResource(torta.getImagen1());

        holder.setOnClickSelectedListener(torta,onTortaSelectedListener);
    }

    @Override
    public int getItemCount() {

        return dataset.size();
    }

    public void setDataSet(List<Torta> tortas){
            if(tortas == null)
            dataset = new ArrayList<>();
        else
            dataset =  tortas;
        notifyDataSetChanged();
    }



    public class TortaViewHolder extends RecyclerView.ViewHolder {
        View cardView;
        ImageView imagen;
        TextView nombre;

        public TortaViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_main);
            imagen = itemView.findViewById(R.id.imagen_item);
            nombre = itemView.findViewById(R.id.text_item);
        }



        public void setOnClickSelectedListener(final Torta torta, final onTortaSelectedListener onTortaSelectedListener){
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onTortaSelectedListener.onTortaSelected(torta);
                }
            });

        }
    }
}
