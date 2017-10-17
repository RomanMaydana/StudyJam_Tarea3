package com.maydana.roman.recycleviewtiemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetalleActivity extends AppCompatActivity {
    private ImageView imagenDetalle1,imagenDetalle2;
    private TextView nombre, descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imagenDetalle1 = (ImageView)findViewById(R.id.imagen1_detalle);
        imagenDetalle2 = (ImageView)findViewById(R.id.imagen2_detalle);
        nombre = (TextView)findViewById(R.id.texto_detalle);
        descripcion = (TextView)findViewById(R.id.descripcion_detalle);

        Bundle bundle = getIntent().getExtras();
        Torta torta = (Torta)bundle.getSerializable("torta");
        imagenDetalle1.setImageResource(torta.getImagen1());
        imagenDetalle2.setImageResource(torta.getImagen2());
        nombre.setText(torta.getNombre());
        descripcion.setText(torta.getDescripcion());
    }
}
