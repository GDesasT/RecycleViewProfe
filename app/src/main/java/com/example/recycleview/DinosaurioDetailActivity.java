package com.example.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DinosaurioDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinosaurio_detail);

        // Referencias a los elementos de la vista
        TextView txtNombre = findViewById(R.id.txtNombreDetail);
        TextView txtTipo = findViewById(R.id.txtTipoDetail);
        TextView txtDescripcion = findViewById(R.id.txtDescripcionDetail);
        ImageView imgDino = findViewById(R.id.imgDinoDetail);

        // Obtener datos del intent
        Intent intent = getIntent();
        if (intent != null) {
            txtNombre.setText(intent.getStringExtra("nombre"));
            txtTipo.setText(intent.getStringExtra("tipo"));
            txtDescripcion.setText(intent.getStringExtra("descripcion"));
            imgDino.setImageResource(intent.getIntExtra("imagen", 0));
        }
    }
}
