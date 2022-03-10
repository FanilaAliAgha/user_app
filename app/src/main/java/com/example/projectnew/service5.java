package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class service5 extends AppCompatActivity {
    Button payment;
    androidx.cardview.widget.CardView msgicon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service5);

        payment=findViewById(R.id.payment);
        msgicon=findViewById(R.id.msgicon);


        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(service5.this,Screenfifteen.class);
                startActivity(intent);
            }
        });

        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(service5.this,Screeneleven.class);
                startActivity(intent);

            }
        });
    }
}