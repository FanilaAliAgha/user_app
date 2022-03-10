package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shop9 extends AppCompatActivity {

    androidx.cardview.widget.CardView msgicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop9);

        msgicon=findViewById(R.id.msgicon);


        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(shop9.this,Screeneleven.class);
                startActivity(intent);
            }
        });
    }
}