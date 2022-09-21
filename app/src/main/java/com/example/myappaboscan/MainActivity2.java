package com.example.myappaboscan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        RecyclerView recyclerView1 = findViewById(R.id.recyclerid);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));

        RecyclerViewAdapter recyclerViewAdapter1 = new RecyclerViewAdapter(obtenerlista());
        recyclerView1.setAdapter(recyclerViewAdapter1);


    }

    public List<modelosList> obtenerlista(){
        List<modelosList> lista=new ArrayList();
        lista.add(new modelosList("Anthony Boscan","Venezuela",R.drawable.anthony));
        lista.add(new modelosList("Over Martinez","Venezuela",R.drawable.over));
        lista.add(new modelosList("Felipe Abarca","Bolivia",R.drawable.img1));
        lista.add(new modelosList("Cristian Jose","Peru",R.drawable.img2));
        lista.add(new modelosList("Reina Caseres","Argentina",R.drawable.img3));
        lista.add(new modelosList("Rodrigo Montiel","Colombia",R.drawable.img4));
        lista.add(new modelosList("Jhon  chichon","Mexico",R.drawable.img5));
        lista.add(new modelosList("Santo Tomas","Chile",R.drawable.img6));
        return  lista;
    }
}