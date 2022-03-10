package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screennine extends AppCompatActivity {
    Button cancelride;

    androidx.cardview.widget.CardView msgicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screennine);
        cancelride=findViewById(R.id.cancelride);


        cancelride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Screennine.this,Screenten.class);
                startActivity(a);
            }

        });

        msgicon= findViewById(R.id.msgicon);

        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(Screennine.this,Screeneleven.class);
                startActivity(inte);
            }
        });
    }
}