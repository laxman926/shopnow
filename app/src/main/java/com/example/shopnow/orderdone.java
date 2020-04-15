package com.example.shopnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orderdone extends AppCompatActivity {


    Button close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdone);

        MyDialog myDialog = new MyDialog();
        myDialog.show(getSupportFragmentManager(), "123");

        close=(Button)findViewById(R.id.close);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                closeapp();
            }
        });

    }

    public void closeapp(){
        Intent intent= new Intent(this,signIn.class);
        startActivity(intent);
    }
}
