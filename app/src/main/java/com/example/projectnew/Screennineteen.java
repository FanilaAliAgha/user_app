package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screennineteen extends AppCompatActivity {
    Button cancelshipment;

    androidx.cardview.widget.CardView msgicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screennineteen);

        cancelshipment= findViewById(R.id.cancelshipment);
        msgicon= findViewById(R.id.msgicon);

        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(Screennineteen.this,Screeneleven.class);
                startActivity(inte);
            }
        });

        cancelshipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Screennineteen.this,Screenten.class);
                startActivity(a);
            }
        });
    }
}