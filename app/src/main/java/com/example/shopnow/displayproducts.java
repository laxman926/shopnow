package com.example.shopnow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class displayproducts extends AppCompatActivity {

    TextView mTitletv, mDescTv;
    ImageView mImageIv;
    Button checkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayproducts);

        ActionBar actionBar = getSupportActionBar();

        checkout = (Button) findViewById(R.id.checkout);


        mTitletv=findViewById(R.id.disProdName);
        mDescTv=findViewById(R.id.disProdDes);
        mImageIv= findViewById(R.id.disProdImg);

        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCheckout();
            }
        });

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        actionBar.setTitle(mTitle);


        mTitletv.setText((mTitle));
        mDescTv.setText(mDescription);
        mImageIv.setImageBitmap(bitmap);

    }

    public void openCheckout(){

        Intent intent = new Intent(this,checkout.class);
                startActivity(intent);
    }
}
