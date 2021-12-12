package com.example.myproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Pizza1 extends AppCompatActivity {
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizza1);

        Button b1 = findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast toast = Toast.makeText(getApplicationContext(), "주문이 접수되었습니다.", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
