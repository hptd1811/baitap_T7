package com.example.apptonghop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button login;
    Button ql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);
        login = (Button) findViewById(R.id.bt_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListMusic();
            }
        });
        ql = (Button) findViewById(R.id.bt_ql_sup);
        ql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignup();
            }
        });

    }

    public void openListMusic() {
        Intent it = new Intent(Login.this, ListTranh.class);
        startActivity(it);
    }


    public void openSignup() {
        Intent it = new Intent(Login.this, SignUp.class);
        startActivity(it);
    }
}
