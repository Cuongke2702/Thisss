package com.example.tnhieu.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Calculaytor extends AppCompatActivity {
    private TextView t3,t4;
    private Button b1,b2;
    private String C,D;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculator);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        b1=(Button)findViewById(R.id.btncong);
        b2=(Button)findViewById(R.id.btnchia);
        nhanhan();



    }
    public void nhanhan(){
        Intent intent=getIntent();
        C=intent.getStringExtra(MainActivity.A);
        D=intent.getStringExtra(MainActivity.B);
        t3.setText(C);
        t4.setText(D);
    }
}
