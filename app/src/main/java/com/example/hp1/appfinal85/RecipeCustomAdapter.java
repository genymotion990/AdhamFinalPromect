package com.example.hp1.appfinal85;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Hp1 on 27/09/2017.
 */

public class RecipeCustomAdapter extends ArrayAdapter<String> {

    private int resource;

    public RecipeCustomAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        this.resource = resource;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View cuView = imageInflater.inflate(resource, parent, false );

        String item = getItem(position);
        TextView title = (TextView) cuView.findViewById(R.id.tvRecipe);
        CheckBox cb = (CheckBox) cuView.findViewById(R.id.checkBox);
        title.setText(item);

        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
        return cuView;
    }
}
