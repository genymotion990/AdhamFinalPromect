package com.example.hp1.appfinal85;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fridge extends AppCompatActivity implements View.OnClickListener{

    Button btSalad, btMeat, btDessert, btFruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);

        btSalad = (Button) findViewById(R.id.btSalad);
        btSalad.setOnClickListener(this);

        btMeat = (Button) findViewById(R.id.btMeat);
        btMeat.setOnClickListener(this);

        btDessert = (Button) findViewById(R.id.btDessert);
        btDessert.setOnClickListener(this);

        btFruits = (Button) findViewById(R.id.btFruits);
        btFruits.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, AllRecipeActivity.class);

        if(v==btSalad) {
            i.putExtra("category", "salads");
        }
        if(v==btFruits) {
            i.putExtra("category", "fruits");
        }
        if(v==btMeat) {
            i.putExtra("category", "meat");
        }
        if(v==btDessert) {
            i.putExtra("category", "dessert");
        }
        startActivity(i);
    }
}
