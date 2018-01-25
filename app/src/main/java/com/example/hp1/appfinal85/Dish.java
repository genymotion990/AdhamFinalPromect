package com.example.hp1.appfinal85;

import java.util.ArrayList;

/**
 * Created by Hp1 on 16/11/2017.
 */

public class Dish {

    private long id;
    private String name;
    private String categories;
    private String preperation;

    private ArrayList<String> ingredients;

    public Dish(long id, String name, String categories, String preperation, ArrayList<String> ingredients) {
        this.id = id;
        this.name = name;
        this.categories = categories;
        this.preperation = preperation;
        this.ingredients = ingredients;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getPreperation() {
        return preperation;
    }

    public void setPreperation(String preperation) {
        this.preperation = preperation;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
}
