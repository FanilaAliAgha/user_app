package com.example.projectnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class buy4 extends AppCompatActivity {
    androidx.cardview.widget.CardView msgicon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy4);


        msgicon =findViewById(R.id.msgicon);




        msgicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(buy4.this,Screeneleven.class);
                startActivity(intent);
            }
        });

        ImageSlider imageSlider =findViewById(R.id.slider);

        List<SlideModel> slideModels =new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.oneimg));
        slideModels.add(new SlideModel(R.drawable.twoimg));
        slideModels.add(new SlideModel(R.drawable.threeimg));
        slideModels.add(new SlideModel("https://picsum.photos/id/237/200/300"));
        slideModels.add(new SlideModel("https://picsum.photos/200/300?grayscale"));
        slideModels.add(new SlideModel("https://picsum.photos/200/300/?blur"));



        imageSlider.setImageList(slideModels,true);
    }
}