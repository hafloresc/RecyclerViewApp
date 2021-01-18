package com.rbtechnology3.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<elementos> listadeelementos;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.RecyclerView);

        listadeelementos= new ArrayList<>();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        llenarlista();
        Adapterlista adapterlista=new Adapterlista(listadeelementos);
        recyclerView.setAdapter(adapterlista);
        
    }

    private void llenarlista() {
        listadeelementos.add(new elementos("el cerro cotacachi","descripcion de la noticia, aca ponermos todo lo que paso en los votos1", R.drawable.cerro));
        listadeelementos.add(new elementos("el nevado cayambe","descripcion de la noticia, aca ponermos todo lo que paso en los votos2", R.drawable.nevado));
    }
}