package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Screeneighteen extends AppCompatActivity {
   Button button;
//   ImageView backarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screeneighteen);

        button=findViewById(R.id.button);
//        backarrow=findViewById(R.id.backarrow);
//
//        backarrow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent c = new Intent(Screeneighteen.this,Screenseventeen.class);
//            startActivity(c);
//            finish();
//            }
//        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Screeneighteen.this,Screennineteen.class);
                startActivity(a);
            }
        });


    }
}