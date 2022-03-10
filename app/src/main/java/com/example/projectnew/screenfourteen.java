package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screenfourteen extends AppCompatActivity {


    Button billbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screenfourteen);


        billbtn=findViewById(R.id.billbtn);


        billbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(screenfourteen.this,Screenthirteen.class);
                startActivity(intent);
            }
        });
    }
}