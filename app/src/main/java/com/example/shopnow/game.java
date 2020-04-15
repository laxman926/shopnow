package com.example.shopnow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class game extends AppCompatActivity {


    TextView t1, t2, t3;
    TextView a1, result;
    Button r, w;
    int j = 0, I1, I2, I3;
    boolean sol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);




        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        a1 = (TextView) findViewById(R.id.textView4);


        r = (Button) findViewById(R.id.button);
        w = (Button) findViewById(R.id.button2);
        result = (TextView) findViewById(R.id.textView5);


        t1.setText("" + random());
        t3.setText("" + random());
        a1.setText("" + random());
        I3 = Integer.parseInt(a1.getText().toString());
        I1 = Integer.parseInt(t1.getText().toString());
        I2 = Integer.parseInt(t3.getText().toString());


        if (t2.getText().equals("+"))

        {
            t2.setText("-");

            if ((I1 - I2) == I3) {
                sol = true;

            } else {
                sol = false;
            }
        }




        else

        {
            t2.setText("+");

            if ((I1 + I2) == I3)
            {
                sol = true;

            }
            else
            {
                sol = false;
            }
        }


        r.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View v) {


                if (sol == true) {

                    j++;
                    result.setText("" + j);
                }

                else
                {
                    j--;
                    result.setText("" + j);
                }
                t1.setText("" + random());
                t3.setText("" + random());
                a1.setText("" + random());
            }


        });

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (sol == false) {
                    j++;
                    result.setText("" + j);
                } else {
                    j--;
                    result.setText("" + j);
                }
                t1.setText("" + random());
                t3.setText("" + random());
                a1.setText("" + random());
            }
        });


    }


    public int random() {
        Random num = new Random();
        int nn = num.nextInt(20) + 0;
        return nn;

    }


    }

