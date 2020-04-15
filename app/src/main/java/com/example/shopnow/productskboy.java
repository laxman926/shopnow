package com.example.shopnow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class productskboy extends AppCompatActivity {
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
        m.setTitle("Boy's Quilted Regular fit Jacket");
        m.setDescription("Price:₹ 759.00");
        m.setImg(R.drawable.k1);
        models.add(m);

        m= new Model();
        m.setTitle("Beat London by Pepe Jeans boy's Solid Slim");
        m.setDescription("Price:\t₹ 856.00");
        m.setImg(R.drawable.k2);
        models.add(m);

        m= new Model();
        m.setTitle("Boys' Black Cotton Blend Sherwani  ");
        m.setDescription("Price:\t₹ 556.00");
        m.setImg(R.drawable.k3);
        models.add(m);

        m= new Model();
        m.setTitle("Boys Cotton Tshirt - AFT-AFT");
        m.setDescription("Price:\t₹ 996.00");
        m.setImg(R.drawable.k4);
        models.add(m);

        m= new Model();
        m.setTitle("Boy's Plain Polo");
        m.setDescription("Price:\t₹ 1856.00");
        m.setImg(R.drawable.k5);
        models.add(m);


        m= new Model();
        m.setTitle("Boys Fullsleeve HD Jacket ");
        m.setDescription("Price:\t₹ 867.00");
        m.setImg(R.drawable.k6);
        models.add(m);

        m= new Model();
        m.setTitle("Boy's Quilted Regular fit Jacket ");
        m.setDescription("Price:\t₹ 546.00");
        m.setImg(R.drawable.k7);
        models.add(m);

        return models;

    }
}