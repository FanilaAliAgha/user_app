package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class joffer1 extends AppCompatActivity {
    androidx.cardview.widget.CardView msgicon;

    androidx.cardview.widget.CardView jobpost;
    androidx.cardview.widget.CardView card_Filter;
    Button view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joffer1);

        msgicon=findViewById(R.id.msgicon);
        view=findViewById(R.id.view);
        jobpost=findViewById(R.id.jobpost);
        card_Filter=findViewById(R.id.card_Filter);


        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(joffer1.this,Screeneleven.class);
                startActivity(intent);

            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(joffer1.this,joffer2.class);
                startActivity(intent);
            }
        });


        jobpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(joffer1.this,joffer3.class);
                startActivity(intent);
            }
        });


        card_Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(joffer1.this,joffer4.class);
                startActivity(intent);
            }
        });


    }
}