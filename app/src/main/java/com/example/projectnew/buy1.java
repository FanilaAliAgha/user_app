package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buy1 extends AppCompatActivity {
    androidx.cardview.widget.CardView filter;
    androidx.cardview.widget.CardView addpost;
    Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy1);


        filter =findViewById(R.id.filter);
        view =findViewById(R.id.view);
        addpost =findViewById(R.id.addpost);


        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy1.this,buy2.class);
                startActivity(intent);
            }
        });

        addpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy1.this,buy3.class);
                startActivity(intent);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buy1.this,buy4.class);
                startActivity(intent);
            }
        });
    }
}