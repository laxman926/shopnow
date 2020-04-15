package com.example.shopnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button signIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setLogo(R.drawable.cart4);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main);

       signIn = (Button) findViewById(R.id.signIn);

       signIn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               openHomepage();
           }
       });
    }

    public void openHomepage() {

//        Intent intent= new Intent(this, homepage.class);
        Intent intent= new Intent(this, signIn.class);
        startActivity(intent);
    }
}
