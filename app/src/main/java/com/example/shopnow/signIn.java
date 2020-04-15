package com.example.shopnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signIn extends AppCompatActivity {

    EditText mUsername,mPassword;
    Button mSignin;
    TextView mSignup;
    DatabaseHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        db = new DatabaseHelper(this);

        mPassword=(EditText)findViewById(R.id.password);
        mUsername=(EditText)findViewById(R.id.username);
        mSignin=(Button) findViewById(R.id.signin);
        mSignup=(TextView) findViewById(R.id.signup);

        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registerIntent=new Intent(signIn.this,RegisterPage.class);
                startActivity(registerIntent);
            }
        });

        mSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = mUsername.getText().toString().trim();
                String pwd = mPassword.getText().toString().trim();

                Boolean res = db.checkUser(user, pwd);

                if(res == true)
                {
                    Intent HomePage = new Intent(signIn.this,homepage.class);
                    startActivity(HomePage);
                }
                else
                {
                    Toast.makeText(signIn.this,"Login Error. New User? SignUp",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
