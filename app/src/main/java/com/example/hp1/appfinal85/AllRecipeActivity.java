package com.example.hp1.appfinal85;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.lang.System.in;

public class AllRecipeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String category;
    ListView lvRecipes;
    ArrayList<String> recipes = new ArrayList<String >();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_recipte);

        lvRecipes = (ListView) findViewById(R.id.lvRecipes);


        category = getIntent().getStringExtra("category");
        addRecipeByCategory(category);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, recipes);
        lvRecipes.setAdapter(adapter);
        lvRecipes.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String str = (String) parent.getAdapter().getItem(position);

        Intent i = new Intent(this, RecipeActivity.class);
        i.putExtra("id",R.raw.salad1);
        startActivity(i);
    }



    public void addRecipeByCategory(String category){
        if(category.equals("salads")){
            recipes.add("salad1");
            recipes.add("salad2");
            recipes.add("salad3");
            recipes.add("salad4");
        }
        if (category.equals("fruits")){
            recipes.add("fruits1");
            recipes.add("fruits2");
            recipes.add("fruits3");

        }
        if (category.equals(("dessert"))){
            recipes.add("dessert1");
            recipes.add("dessert2");
            recipes.add("dessert3");
        }
        if(category.equals("meat")){
            recipes.add("meat1");
            recipes.add("meat2");
            recipes.add("meat3");
        }
    }
}
