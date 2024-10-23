package com.example.recycleview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.adapter.DinosaurioAdapter;
import com.example.recycleview.models.Dinosaurio;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerDino;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerDino = findViewById(R.id.recyclerDino);

        List<Dinosaurio> dinosaurioLista=new ArrayList<>();
        dinosaurioLista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.images));
        dinosaurioLista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.images));
        dinosaurioLista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.images));
        dinosaurioLista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.images));
        dinosaurioLista.add(new Dinosaurio("T-rex","Carnivoro","Es un dinosaurio muy comelon","Verde",R.drawable.images));
        //parte 6 construir adaptador
        DinosaurioAdapter adapter = new DinosaurioAdapter(dinosaurioLista);
        recyclerDino.setAdapter(adapter);
        recyclerDino.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerDino.setHasFixedSize(true);
    }
}