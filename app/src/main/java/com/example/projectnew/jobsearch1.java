package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jobsearch1 extends AppCompatActivity {
    androidx.cardview.widget.CardView msgicon;
    androidx.cardview.widget.CardView jobpost;
    androidx.cardview.widget.CardView card_Filter;
    Button view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobsearch1);


        msgicon=findViewById(R.id.msgicon);
        jobpost=findViewById(R.id.jobpost);
        card_Filter=findViewById(R.id.card_Filter);
        view=findViewById(R.id.view);


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(jobsearch1.this,jobsearch2.class);
                startActivity(intent);
            }
        });

        jobpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(jobsearch1.this,jobsearch3.class);
                startActivity(intent);
            }
        });


        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jobsearch1.this,Screeneleven.class);
                startActivity(intent);

            }
        });

        card_Filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(jobsearch1.this,jobsearch4.class);
                startActivity(intent);
            }
        });
    }
}