package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Otppage extends AppCompatActivity {
ImageView arrowabck;
Button confirmbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otppage);

        confirmbtn=findViewById(R.id.confirmbtn);

        arrowabck= findViewById(R.id.arrowabck);

        arrowabck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Otppage.this,Signup.class);
                startActivity(intent);

            }
        });

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Otppage.this,Dashboard.class);
                startActivity(intent);
            }
        });
    }
}