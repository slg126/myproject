package com.example.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PizzaList2 extends AppCompatActivity {
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza_list);

        Button b1, b2, b3;

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Pizza1.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Pizza2.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Pizza3.class);
                startActivity(intent);
            }
        });
    }
}
