package com.example.shopnow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class productskgirl extends AppCompatActivity {
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
        m.setTitle("Baby Girls Dress Birthday Frocks ");
        m.setDescription("Price:₹ 759.00");
        m.setImg(R.drawable.g1);
        models.add(m);

        m= new Model();
        m.setTitle("ANVI Collections Girls Birthday ");
        m.setDescription("Price:\t₹ 856.00");
        m.setImg(R.drawable.g2);
        models.add(m);

        m= new Model();
        m.setTitle("Baby Girls Frock Dress  ");
        m.setDescription("Price:\t₹ 556.00");
        m.setImg(R.drawable.g3);
        models.add(m);

        m= new Model();
        m.setTitle("Girl's Tafetta silk Semi-Stitched ");
        m.setDescription("Price:\t₹ 996.00");
        m.setImg(R.drawable.g4);
        models.add(m);

        m= new Model();
        m.setTitle("Girls Fancy Full Length Gown Dress");
        m.setDescription("Price:\t₹ 1856.00");
        m.setImg(R.drawable.g5);
        models.add(m);


        m= new Model();
        m.setTitle("Kids Party Wear Kurta and Palazzo  ");
        m.setDescription("Price:\t₹ 867.00");
        m.setImg(R.drawable.g6);
        models.add(m);

        m= new Model();
        m.setTitle("Kids Party Wear Kurta and Sharara  ");
        m.setDescription("Price:\t₹ 546.00");
        m.setImg(R.drawable.g7);
        models.add(m);

        return models;

    }
}
