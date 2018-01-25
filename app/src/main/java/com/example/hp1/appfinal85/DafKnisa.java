package com.example.hp1.appfinal85;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DafKnisa extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemClickListener{

    Button btFind,btAdd;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daf_knisa);

        btFind=(Button)findViewById(R.id.btFind);
        btAdd=(Button)findViewById(R.id.btAdd);
        image= (ImageView)findViewById(R.id.imageView);

        btFind.setOnClickListener(this);
        btAdd.setOnClickListener(this);
        image.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        slide(v);
        if (v == btFind) {
            Intent i = new Intent(this, Fridge.class);
            startActivity(i);
        }
        if (v == btAdd) {
            Intent intent = new Intent(this, Fridge2.class);
            startActivity(intent);

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnLink:
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setCancelable(true);
                builder.setTitle("Website");
                builder.setMessage("the website is in progress");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.create().show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void slide(View view){



        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        image.startAnimation(animation1);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (view == image) {
            Intent i = new Intent(this, Metsrakhim.class);
            startActivity(i);
        }
    }
}

