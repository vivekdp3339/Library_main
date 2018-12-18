package com.example.win10.library_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private ArrayList<Data_Model> horizontalList;
    private CustomAdapter horizontalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        horizontalList = new ArrayList<Data_Model>();
        for (int i = 0; i < MyData.TITLES.length; i++) {
            horizontalList.add(new Data_Model(
                    MyData.TITLES[i],MyData.VIEW[i], MyData.RATE[i], MyData.IMAGES[i]
            ));
        }
        horizontalAdapter=new CustomAdapter(horizontalList);
        LinearLayoutManager horizontalLayoutManagaer
                = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManagaer);
        recyclerView.setAdapter(horizontalAdapter);
    }}