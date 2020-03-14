package com.example.demorecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<contact> Contacts;
    private ListView list;
    private ContactAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contacts = new ArrayList<contact>();
        list = findViewById(R.id.items);
        //creating fake contacts for example
        Contacts.add(new contact(R.drawable.ic_launcher_background, "Akeena", "346348938"));
        Contacts.add(new contact(R.drawable.ic_launcher_background, "Michael", "346348938"));
        Contacts.add(new contact(R.drawable.ic_launcher_background, "Bob", "30954u5884"));

        myAdapter = new ContactAdapter(this, Contacts);
        list.setAdapter(myAdapter);
    }
}
