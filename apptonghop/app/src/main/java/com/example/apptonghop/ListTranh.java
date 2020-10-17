package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListTranh extends AppCompatActivity {
    private ListView listView_tranh;




    String[] tentranh={
            "Tranh hiện đại","Tranh Canvas","Tranh sơn dầu","Tranh Hươu hiện đại",
    };
    String[] tacgia={
            "A.S.Min","Jack","Jenie","Chen",
    };
    Integer[] anh={
            R.drawable.anh1,R.drawable.anh2,R.drawable.anh3,R.drawable.anh4,
    };


    Button bttAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tranh);
        Customer adapter=new Customer(this,tentranh,tacgia,anh);
        listView_tranh=(ListView) findViewById(R.id.list_casi);
        listView_tranh.setAdapter(adapter);


        bttAcc=(Button)findViewById(R.id.btAcc);
        bttAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }
    public void openProfile(){
        Intent it=new Intent(ListTranh.this,Profile.class);
        startActivity(it);
    }
}
