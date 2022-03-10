package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screentwentytwo extends AppCompatActivity {
Button billbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screentwentytwo);
        billbtn=findViewById(R.id.billbtn);


        billbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Screentwentytwo.this,Screentwentyone.class);
                startActivity(intent);
            }
        });
    }
}