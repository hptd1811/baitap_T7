package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    Button btSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangki);
        btSignUp =(Button) findViewById(R.id.btsign_up);
        btSignUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent it =new Intent(SignUp.this, Login.class);
                startActivity(it);
            }
        });
    }
    }
