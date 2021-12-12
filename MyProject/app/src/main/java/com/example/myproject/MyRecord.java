package com.example.myproject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyRecord extends AppCompatActivity {

    int n = 1;
    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_list);

        myRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);

        ArrayList<Foods> foodInfo = new ArrayList<>();
        MyAdapter myAdapter = new MyAdapter(foodInfo);
        myRecyclerView.setAdapter(myAdapter);

        foodInfo.add(new Foods(R.drawable.chicken, "15000원", "후라이드치킨"));
        foodInfo.add(new Foods(R.drawable.pizza2, " 32000원 ", "립스테이크바이트"));
        foodInfo.add(new Foods(R.drawable.hotdog3, "3500원", "치킨핫도그"));


        myAdapter.notifyDataSetChanged();
    }
}
