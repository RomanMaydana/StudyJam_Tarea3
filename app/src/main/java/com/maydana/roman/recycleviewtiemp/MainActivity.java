package com.maydana.roman.recycleviewtiemp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TortaAdapter.onTortaSelectedListener{
    RecyclerView tortaRecyclerView;
    TortaAdapter tortaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tortaRecyclerView = (RecyclerView)findViewById(R.id.recicleView);
        tortaRecyclerView.setHasFixedSize(true);
        tortaRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        tortaAdapter = new TortaAdapter(this,this);
        llenarDatos();
        tortaRecyclerView.setAdapter(tortaAdapter);


    }

    private void llenarDatos() {
        List<Torta> lista = new ArrayList<>();
        lista.add(new Torta(R.drawable.torta1,R.drawable.torta11,getString(R.string.cumple_mama),getString(R.string.descripcion1)));
        lista.add(new Torta(R.drawable.torta2,R.drawable.torta22,getString(R.string.cumpleaños),getString(R.string.descripcion2)));
        lista.add(new Torta(R.drawable.torta3,R.drawable.torta33,getString(R.string.dia_del_padre),getString(R.string.descripcion3)));
        lista.add(new Torta(R.drawable.torta4,R.drawable.torta44,getString(R.string.angry_Birds),getString(R.string.descripcion4)));
        lista.add(new Torta(R.drawable.torta5,R.drawable.torta55,getString(R.string.navidad),getString(R.string.descripcion5)));
        lista.add(new Torta(R.drawable.torta6,R.drawable.torta66,getString(R.string.navidad),getString(R.string.descripcion6)));
        lista.add(new Torta(R.drawable.torta7,R.drawable.torta77,getString(R.string.plantaVsZombi),getString(R.string.descripcion7)));
        lista.add(new Torta(R.drawable.torta8,R.drawable.torta88,getString(R.string.hulk),getString(R.string.descripcion8)));
        lista.add(new Torta(R.drawable.torta9,R.drawable.torta99,getString(R.string.batman),getString(R.string.descripcion9)));
        lista.add(new Torta(R.drawable.torta10,R.drawable.torta1010,getString(R.string.graduacion),getString(R.string.descripcion10)));
        lista.add(new Torta(R.drawable.hotkey1,R.drawable.hotkey11,getString(R.string.cupcakes),getString(R.string.descripcion11)));

        tortaAdapter.setDataSet(lista);

    }

    @Override
    public void onTortaSelected(Torta torta) {
        Intent intent = new Intent(getApplicationContext(),DetalleActivity.class);
        intent.putExtra("torta",torta);
        startActivity(intent);
    }
}
