package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Screensixteen extends AppCompatActivity {

//ImageView backarrow;
    androidx.cardview.widget.CardView bike;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screensixteen);

        bike=findViewById(R.id.bike);
//        backarrow=findViewById(R.id.backarrow);

        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Screensixteen.this,Screenseventeen.class);
                startActivity(a);

            }
        });


//        backarrow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent Intent = new Intent(Screensixteen.this,Dashboard.class);
//                startActivity(Intent);
//                finish();
//            }
//        });
    }
}