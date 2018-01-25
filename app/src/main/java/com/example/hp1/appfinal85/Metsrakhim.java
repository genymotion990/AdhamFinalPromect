package com.example.hp1.appfinal85;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Metsrakhim extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvMetsrakheem;
    ArrayList arrMetsrakheem = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metsrakhim);

        arrMetsrakheem.add("Meat");
        arrMetsrakheem.add("Fruits");
        arrMetsrakheem.add("Vegetables");
        arrMetsrakheem.add("basic ingridients");

        lvMetsrakheem = (ListView) findViewById(R.id.lvMetsrakheem);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrMetsrakheem);
        lvMetsrakheem.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
