package com.example.hp1.appfinal85;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class
MainActivity extends AppCompatActivity implements  AdapterView.OnItemLongClickListener,View.OnClickListener {


    ListView lvFood;

    ArrayList<Item> arrFood=new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrFood.add(new Item("First Item", R.drawable.brad1));
        arrFood.add(new Item("First Item", R.drawable.fruits));
        CustomAdapter adapter = new CustomAdapter(this, R.layout.custom_row, arrFood);

        lvFood = (ListView) findViewById(R.id.lvFood);
        lvFood.setAdapter(adapter);

        lvFood.setOnItemLongClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
       if (position==0){
/*
           Intent i = new Intent(this,.class);
           startActivity(i);
*/

       }



        return true;
    }
}
