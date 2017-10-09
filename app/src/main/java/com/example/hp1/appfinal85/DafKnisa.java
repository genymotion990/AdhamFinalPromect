package com.example.hp1.appfinal85;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DafKnisa extends AppCompatActivity implements View.OnClickListener {

    Button btFind,btAdd;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daf_knisa);

        btFind=(Button)findViewById(R.id.btFind);
        btAdd=(Button)findViewById(R.id.btFind);
        tv1=(TextView)findViewById(R.id.tv1);

        btFind.setOnClickListener(this);
        btAdd.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if (v == btFind) {
            Intent i = new Intent(this, Fridge.class);
            startActivity(i);
        }
        if (v == btAdd) {
            Intent intent = new Intent(this, Fridge2.class);
            startActivity(intent);

        }

    }


}

