package com.example.myproject;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Dictionary;

public class Chicken1 extends AppCompatActivity {

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chicken1);

        Button b1 = findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast toast = Toast.makeText(getApplicationContext(), "주문이 접수되었습니다.", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
