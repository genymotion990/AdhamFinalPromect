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

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemLongClickListener,View.OnClickListener {


    ListView lvFood;
    ArrayAdapter<String> adapter;
    ArrayList<String> arrFood=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrFood.add("fridge");
        arrFood.add("recipe");
        arrFood.add("about");
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrFood);

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
           Intent i = new Intent(this,fridge.class);
           startActivity(i);

       }



        return true;
    }
}
