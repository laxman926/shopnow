package com.example.shopnow;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment

{



    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialoglayout,  null);

        builder.setView (dialogView);

        final TextView viewName = (TextView) dialogView.findViewById(R.id.viewName);
        final Button btnOK = (Button) dialogView.findViewById(R.id.btnOK);
        final Button btnClose = (Button) dialogView.findViewById(R.id.btnClose);

        btnClose.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                dismiss();
//                closeapp();
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewName.setText(" Thank You for Feedback");
            }
        });


        return  builder.create();
    }
//    public void closeapp(){
//        Intent intent= new Intent(this,signIn.class);
//        startActivity(intent);
//    }
}