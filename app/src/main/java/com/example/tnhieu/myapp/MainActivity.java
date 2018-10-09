package com.example.tnhieu.myapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edt1;
    private EditText edt2;
    private Button btnsend;
    private ListView lv;
    public static String A,B;
    ArrayList<String> mArray=new ArrayList<>();    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1=(EditText)findViewById(R.id.edt1);
        edt2=(EditText)findViewById(R.id.edt2);
        btnsend=(Button)findViewById(R.id.btnsend);
        lv=(ListView)findViewById(R.id.lv) ;
        ArrayAdapter mAdapter= new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1,mArray);
        lv.setAdapter(mAdapter);
    }
    public void xuly(View view)
    {
        Intent intent= new Intent(MainActivity.this,Calculaytor.class);
        String x1 =edt1.getText().toString();
        String x2 =edt2.getText().toString();
        int i1 = Integer.parseInt(x1);
        int i2 =Integer.parseInt(x2);
        intent.putExtra(A,i1);
        intent.putExtra(A,i2);

        startActivity(intent);

    }
}
