package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Screensix extends AppCompatActivity {
//    ImageView backarrow;
    androidx.cardview.widget.CardView card1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screensix);
        card1=findViewById(R.id.card1);
//        backarrow =findViewById(R.id.backarrow);
//
//
//        backarrow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(Screensix.this,Dashboard.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a =new Intent(Screensix.this,screenseven.class);
                startActivity(a);
            }
        });

    }
}