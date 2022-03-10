package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screentwelve extends AppCompatActivity {
Button requestdone;

    androidx.cardview.widget.CardView msgicon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screentwelve);


        requestdone=findViewById(R.id.requestdone);
        msgicon=findViewById(R.id.msgicon);

        requestdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Screentwelve.this,screenfourteen.class);
                startActivity(intent);
            }
        });

        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Screentwelve.this,Screeneleven.class);
                startActivity(intent);
            }
        });
    }
}