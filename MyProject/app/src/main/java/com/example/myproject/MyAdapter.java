package com.example.myproject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        static ImageView myPicture;
        static TextView myText;
        static TextView myText2;
        static Button myButton;

        MyViewHolder(View view){
            super(view);
            myPicture = view.findViewById(R.id.food);
            myText = view.findViewById(R.id.name);
            myText2 = view.findViewById(R.id.price);
            myButton = view.findViewById(R.id.button6);

            view.setClickable(true);
        }
    }

    private ArrayList<Foods> myFoods;
    MyAdapter(ArrayList<Foods> food){
        this.myFoods = food;
    }

    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(v);
    }

    public void onBindViewHolder(MyAdapter.MyViewHolder holder, final int position){
        MyViewHolder myViewHolder = (MyViewHolder) holder;

        MyViewHolder.myPicture.setImageResource(myFoods.get(position).getId());
        MyViewHolder.myText.setText(myFoods.get(position).getName());
        MyViewHolder.myText2.setText(myFoods.get(position).getPrice());

        MyViewHolder.myButton.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               myFoods.remove(position);
               notifyItemRemoved(position);
               notifyItemRangeChanged(position, myFoods.size());
           }
        });
    }

    public int getItemCount(){
    return myFoods.size();
    }

}
