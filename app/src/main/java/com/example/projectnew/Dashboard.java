package com.example.projectnew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.companion.DeviceNotAssociatedException;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class Dashboard extends AppCompatActivity {
    androidx.cardview.widget.CardView ride;
    androidx.cardview.widget.CardView card2;
    androidx.cardview.widget.CardView buy;
    androidx.cardview.widget.CardView shop;
    androidx.cardview.widget.CardView service;
    androidx.cardview.widget.CardView career;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



        ride =findViewById(R.id.ride);
        buy =findViewById(R.id.buy);
        career =findViewById(R.id.career);
        service =findViewById(R.id.service);


        card2=findViewById(R.id.card2);

        shop=findViewById(R.id.shop);


        ride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Dashboard.this,Screensix.class);
                startActivity(i);
            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a =new Intent(Dashboard.this,Screensixteen.class);
                startActivity(a);
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b =new Intent(Dashboard.this,shop1.class);
                startActivity(b);
            }
        });

        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Dashboard.this,service1.class);
                startActivity(intent);
            }
        });


        career.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Dashboard.this,career1.class);
                startActivity(intent);
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Dashboard.this,buy1.class);
                startActivity(intent);
            }
        });










    }
}