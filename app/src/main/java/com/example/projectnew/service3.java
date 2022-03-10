package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class service3 extends AppCompatActivity {

    Button confirm;
    Button cancel;
    androidx.cardview.widget.CardView msgicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service3);

        confirm=findViewById(R.id.confirm);
        msgicon=findViewById(R.id.msgicon);
        cancel=findViewById(R.id.cancel);


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(service3.this,service5.class);
                startActivity(intent);
            }
        });



        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(service3.this,service4.class);
                startActivity(intent);
            }
        });


        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(service3.this,Screeneleven.class);
                startActivity(intent);

            }
        });
    }
}