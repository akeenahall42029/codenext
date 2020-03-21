package com.example.android.spotifly;

public class CategoryItem {
    private String name;
    private int photo;

    public CategoryItem(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }
}
