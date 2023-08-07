package com.example.ejercicio3_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        elements= new ArrayList<>();
        elements.add(new ListElement("#775447", "Jose", "Honduras", "Activo"));
        elements.add(new ListElement("#607db8", "Luis", "Honduras", "Activo"));
        elements.add(new ListElement("#7bbb47", "Marco", "Honduras", "Activo"));
        elements.add(new ListElement("#70bd07", "Isabel", "Honduras", "Activo"));
        elements.add(new ListElement("#03a9f4", "Alejandro", "Honduras", "Inactivo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}