package com.example.shopnow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class homepage extends AppCompatActivity {

     ImageButton imgcat1,imgcat2,imgcat3,imgcat4;

    Button strbtn,gamebtn;
    SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        imgcat1 =(ImageButton) findViewById(R.id.imgcat1);
        imgcat2 =(ImageButton) findViewById(R.id.imgcat2);
        imgcat3 =(ImageButton) findViewById(R.id.imgcat3);
        imgcat4 =(ImageButton) findViewById(R.id.imgcat4);
        strbtn =(Button)findViewById(R.id.storebtn);
        gamebtn =(Button)findViewById(R.id.gamebtn);

        gamebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengame();
            }
        });

        //image slider

        sliderView = findViewById(R.id.imageSlider);

        final SliderAdapterExample adapter = new SliderAdapterExample(this);
        adapter.setCount(5);

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINROTATIONTRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.startAutoCycle();

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                sliderView.setCurrentPagePosition(position);
            }
        });


    // open categories pages

        imgcat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProductsPageMan();
            }
        });

        imgcat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProductsPageWomen();
            }
        });
        imgcat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProductsPageKBoy();
            }
        });
        imgcat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProductsPageKGirl();
            }
        });

//
//        ViewPager viewPager = findViewById(R.id.viewPager);
//        ImageAdapter adapter = new ImageAdapter(this);
//        viewPager.setAdapter(adapter);

        strbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStoreLocation();
            }
        });
    }

    public  void openStoreLocation(){
        Intent intent= new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

    public void openProductsPageMan(){
        Intent intent= new Intent(this, products.class);
        startActivity(intent);
    }

    public void openProductsPageWomen(){
        Intent intent= new Intent(this, productswomen.class);
        startActivity(intent);
    }

    public void openProductsPageKBoy(){
        Intent intent= new Intent(this, productskboy.class);
        startActivity(intent);
    }

    public void openProductsPageKGirl(){
        Intent intent= new Intent(this, productskgirl.class);
        startActivity(intent);
    }

    public void opengame(){
        Intent intent=new Intent(this,game.class);
        startActivity(intent);
    }


}
