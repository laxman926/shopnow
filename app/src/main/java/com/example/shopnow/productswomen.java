package com.example.shopnow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class productswomen extends AppCompatActivity {


    RecyclerView mRecyclerView;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);



        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter=new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);
}

    private ArrayList<Model> getMyList(){
        ArrayList<Model> models = new ArrayList<>();

        Model m= new Model();
        m.setTitle("Women's Dark Green Crepe Skater Dress with Side Bow Detailing");
        m.setDescription("Price:₹ 1859.00");
        m.setImg(R.drawable.w1);
        models.add(m);

        m= new Model();
        m.setTitle("Women Off The Shoulder Dress Sleeveless Print Long Dress (XXL)");
        m.setDescription("Price:\t₹ 656.00");
        m.setImg(R.drawable.w2);
        models.add(m);

        m= new Model();
        m.setTitle("Women's Spaghetti Strap Ruched  ");
        m.setDescription("Price:\t₹ 1456.00");
        m.setImg(R.drawable.w3);
        models.add(m);

        m= new Model();
        m.setTitle("Women's 3/4 Sleeve Knee Length  ");
        m.setDescription("Price:\t₹ 976.00");
        m.setImg(R.drawable.w4);
        models.add(m);

        m= new Model();
        m.setTitle("Synthetic a-line Dress ");
        m.setDescription("Price:\t₹ 1856.00");
        m.setImg(R.drawable.w5);
        models.add(m);


        m= new Model();
        m.setTitle("Cotton Navy Blue Printed A-Line ");
        m.setDescription("Price:\t₹ 867.00");
        m.setImg(R.drawable.w6);
        models.add(m);

        m= new Model();
        m.setTitle("Women's Cold Sleeve Skater Dress ");
        m.setDescription("Price:\t₹ 546.00");
        m.setImg(R.drawable.w7);
        models.add(m);

        return models;

    }
}