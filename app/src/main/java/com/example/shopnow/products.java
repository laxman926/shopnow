package com.example.shopnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class products extends AppCompatActivity {

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
        m.setTitle("Arthur Harvey");
        m.setDescription("Price:₹ 759.00");
        m.setImg(R.drawable.img1);
        models.add(m);

        m= new Model();
        m.setTitle("Beat London by Pepe Jeans Men's Solid Slim");
        m.setDescription("Price:\t₹ 856.00");
        m.setImg(R.drawable.img2);
        models.add(m);

        m= new Model();
        m.setTitle("IndoPrimo Men's Cotton Casual ");
        m.setDescription("Price:\t₹ 556.00");
        m.setImg(R.drawable.img3);
        models.add(m);

        m= new Model();
        m.setTitle("EYEBOGLER Men's Cotton Waist Coat Style ");
        m.setDescription("Price:\t₹ 996.00");
        m.setImg(R.drawable.img4);
        models.add(m);

        m= new Model();
        m.setTitle("Dennis Lingo Men's Checkered Teal Blue Slim Fit ");
        m.setDescription("Price:\t₹ 1856.00");
        m.setImg(R.drawable.img5);
        models.add(m);



        m= new Model();
        m.setTitle("Jeevaan Men's Plain Solid Slim Fit");
        m.setDescription("Price:\t₹ 867.00");
        m.setImg(R.drawable.img6);
        models.add(m);

        m= new Model();
        m.setTitle("IndoPrimo  Men's Cotton Casual Shirt ");
        m.setDescription("Price:\t₹ 546.00");
        m.setImg(R.drawable.img7);
        models.add(m);

        return models;

    }
}
