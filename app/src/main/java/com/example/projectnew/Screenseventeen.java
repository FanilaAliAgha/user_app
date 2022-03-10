package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Screenseventeen extends AppCompatActivity {
    Button confirm;
//    ImageView backarrow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenseventeen);
        confirm = findViewById(R.id.confirm);
//        backarrow = findViewById(R.id.backarrow);
//
//backarrow.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View view) {
//        Intent c= new Intent(Screenseventeen.this,Screensixteen.class);
//        startActivity(c);
//        finish();
//    }
//});

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Screenseventeen.this, Screeneighteen.class);
                startActivity(i);
            }
        });



    }
}