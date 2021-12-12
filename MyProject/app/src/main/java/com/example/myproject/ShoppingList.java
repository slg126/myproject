package com.example.myproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ShoppingList extends AppCompatActivity {

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_list);

        ImageView chicken = (ImageView)findViewById(R.id.chicken);
        ImageView pizza = (ImageView)findViewById(R.id.pizza);
        ImageView hotdog = (ImageView)findViewById(R.id.hotdog);
        ImageView pork_cutlet = (ImageView)findViewById(R.id.pork_cutlet);
        Button b1, b2, b3, b4;

        b1 = (Button)findViewById(R.id.call);
        b2 = (Button)findViewById(R.id.sendEmail);
        b3 = (Button)findViewById(R.id.googleMap);
        b4 = (Button)findViewById(R.id.button5);



        b1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01036810387"));
               startActivity(intent);
           }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sendEmail();
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MyMap.class);
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MyRecord.class);
                startActivity(intent);
            }
        });

        chicken.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ChickenList2.class);
                startActivity(intent);
            }
        });

        pizza.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), PizzaList2.class);
                startActivity(intent);
            }
        });

        hotdog.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), HotdogList2.class);
                startActivity(intent);
            }
        });

        pork_cutlet.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), CutletList2.class);
                startActivity(intent);
            }
        });
    }

    protected void sendEmail(){
        String[] TO = {"slg126@naver.com"};
        String[] CC = {""};
        Intent emailIntent = new Intent(Intent.ACTION_SEND);

        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "고객센터에 메일을 보냅니다.");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "건의사항1, 건의사항2");

        try{
            startActivity(Intent.createChooser(emailIntent, "이메일 보내기..."));
            finish();
        }catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(ShoppingList.this, "이메일 전송 오류", Toast.LENGTH_SHORT).show();
        }
    }
}

