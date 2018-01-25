package com.example.hp1.appfinal85;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    ListView lvRecipe;
    ArrayList<String> arRecipe = new ArrayList<String>();
    RecipeCustomAdapter adapter;

    InputStream is=null;
    InputStreamReader in;
    BufferedReader br;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        int id = getIntent().getIntExtra("id",0);
        readRecipe(id);
        lvRecipe = (ListView) findViewById(R.id.lvRecipe);
        adapter = new RecipeCustomAdapter(this, R.layout.recipe_custom_row, arRecipe);
        lvRecipe.setAdapter(adapter);

    }
    public void readRecipe(int id){
        try{
            String temp="";
            String all="";
            //4. open the file for reading
            is=getResources().openRawResource(id);
            //open a channel for file reading
            in= new InputStreamReader(is);
            br= new BufferedReader(in);
            //while end of file not reached
            //readline() reads one line at a time
            while((temp=br.readLine())!=null) {
                all += temp + "\n";//concatinate all lines to a string
                arRecipe.add(temp);
            }

            is.close();//file close
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
