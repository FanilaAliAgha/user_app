package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class screenseven extends AppCompatActivity {

    Button confirm;
  //  ImageView backarrow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenseven);

        confirm=findViewById(R.id.confirm);

       // backarrow=findViewById(R.id.backarrow);

//        backarrow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent b= new Intent(screenseven.this,Screensix.class);
//                startActivity(b);
//                finish();
//            }
//        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(screenseven.this,Screeneight.class);
                startActivity(a);
            }
        });

    }
}