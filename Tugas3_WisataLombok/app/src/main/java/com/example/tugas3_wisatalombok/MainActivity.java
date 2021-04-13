package com.example.tugas3_wisatalombok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisata;
    private ArrayList<ModelWisata> listWisata = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);
        listWisata.addAll(DataWisata.getGroup());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvWisata.setLayoutManager(new LinearLayoutManager(this));
        AdapterWisata adapterWisata = new AdapterWisata(this);
        adapterWisata.setModelWisata(listWisata);
        rvWisata.setAdapter(adapterWisata);
    }
}