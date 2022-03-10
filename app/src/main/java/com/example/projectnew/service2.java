package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class service2 extends AppCompatActivity {
    Button bookme;
    androidx.cardview.widget.CardView msgicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service2);

        bookme=findViewById(R.id.bookme);
        msgicon=findViewById(R.id.msgicon);



        bookme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(service2.this,service3.class);
                startActivity(intent);
            }
        });

        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(service2.this,Screeneleven.class);
                startActivity(intent);

            }
        });
    }
}