package com.example.apptonghop;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Customer extends ArrayAdapter<String>{
    private Activity context;
    private String[] tentranh;
    private String[] tacgia;
    private Integer[] anh;

    public Customer(Activity context,String[] tentranh, String[] tacgia, Integer[] anh) {
        super(context, R.layout.product,tacgia);
        this.context = context;
        this.tentranh = tentranh;
        this.tacgia = tacgia;
        this.anh = anh;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View row = inflater.inflate(R.layout.product,null,true);
        TextView namee =(TextView) row.findViewById(R.id.product_name);
        TextView typee=(TextView) row.findViewById(R.id.product_song);
        ImageView img=(ImageView) row.findViewById(R.id.product_img);

        namee.setText(tentranh[position]);
        typee.setText(tacgia[position]);
        img.setImageResource(anh[position]);
        return row;
    }
}
