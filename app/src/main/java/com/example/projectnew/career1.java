package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class career1 extends AppCompatActivity {


    androidx.cardview.widget.CardView card_jobSeeker;
    androidx.cardview.widget.CardView card_jobOffer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career1);

        card_jobSeeker=findViewById(R.id.card_jobSeeker);
        card_jobOffer=findViewById(R.id.card_jobOffer);

        card_jobOffer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(career1.this,joffer1.class);
                startActivity(intent);
                startActivity(intent);
            }
        });
        card_jobSeeker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(career1.this,jobsearch1.class);
                startActivity(intent);
                startActivity(intent);
            }
        });
    }
}