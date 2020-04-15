package com.example.shopnow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class checkout extends AppCompatActivity {

    private  Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        pay=(Button) findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Your Order has been Placed",Toast.LENGTH_SHORT).show();
                openOrderdone();
            }
        });



//        final Button pay=(Button) findViewById(R.id.pay);
//        final EditText email=(EditText) findViewById(R.id.email);
//
//        final EditText expiry =(EditText) findViewById(R.id.mmyy);
//        final EditText cvc =(EditText) findViewById(R.id.cvc);
//        final EditText card =(EditText) findViewById(R.id.cardnumber);

//
//
//        pay.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view)
//            {
//                String  str=email.getText().toString();
////                String  str1=expiry.getText().toString();
////                String  str2=cvc.getText().toString();
////                String  str3=card.getText().toString();
//
//                if(str.equalsIgnoreCase(""))
//                {
//                    email.setHint("please enter username");//it gives user to hint
//                    email.setError("please enter username");//it gives user to info message //use any one //
//                }
//                else
//                {
//                    Toast.makeText(getApplicationContext(),"Email is empty", Toast.LENGTH_SHORT).show();
//                }
//
//
//            }
//        });
//    }


}

    public void openOrderdone() {
        Intent intent= new Intent(this,orderdone.class);
        startActivity(intent);
    }
}
