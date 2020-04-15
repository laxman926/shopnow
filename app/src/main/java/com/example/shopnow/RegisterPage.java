package com.example.shopnow;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterPage extends AppCompatActivity {


    EditText mRegName,mRegPassword,mRegConPass,mRegEmail;
    Button mRegSignup;
    ImageButton profilepicCam;
    ImageView profileDisplay;
    TextView mRegSignin;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        db = new DatabaseHelper(this);

        profilepicCam = (ImageButton) findViewById(R.id.cambtn);
        profileDisplay=(ImageView)findViewById(R.id.profile_image);


        mRegName=(EditText)findViewById(R.id.reg_name);
        mRegPassword=(EditText)findViewById(R.id.reg_password);
        mRegConPass=(EditText)findViewById(R.id.reg_confirmPassword);
        mRegEmail=(EditText)findViewById(R.id.reg_emailid);
        mRegSignup=(Button) findViewById(R.id.reg_registerBtn);
        mRegSignin=(TextView) findViewById(R.id.reg_SignIn);

        mRegSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goSignInPage= new Intent(RegisterPage.this,signIn.class);
                startActivity(goSignInPage);
            }
        });

        mRegSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = mRegName.getText().toString().trim();
                String password = mRegPassword.getText().toString().trim();
                String cnf_pwd = mRegConPass.getText().toString().trim();
                String email = mRegEmail.getText().toString().trim();

                if(password.equals(cnf_pwd)){
                    long val=db.addUser(user,password,email);
                    if(val > 0){
                        Toast.makeText(RegisterPage.this,"You have registered",Toast.LENGTH_SHORT).show();
                        Intent moveToLogin = new Intent(RegisterPage.this,signIn.class);
                        startActivity(moveToLogin);
                    }
                    else{
                        Toast.makeText(RegisterPage.this,"Registeration Error",Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(RegisterPage.this,"Password is not matching",Toast.LENGTH_SHORT).show();
                }
            }
        });

        profilepicCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bitmap = (Bitmap) data.getExtras().get("data");
        profileDisplay.setImageBitmap(bitmap);

    }
}

