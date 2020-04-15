package com.example.shopnow;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView mimageView;
    TextView mTitle, mDes;
    ItemClickListener itemClickListener;

    MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mimageView= itemView.findViewById(R.id.imageCard);
        this.mTitle= itemView.findViewById(R.id.titleCard);
        this.mDes= itemView.findViewById(R.id.DesCard);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClickListener(v,getLayoutPosition());


    }
    public void setItemClickListener(ItemClickListener ic){

        this.itemClickListener=ic;
    }
}
