package com.example.demorecycler;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

//ArrayAdaper is a parent class, contact is a child  class; this code extends the behaivor to the child class
//extends - inheritance
public class ContactAdapter extends ArrayAdapter<contact> {
    //when building an adapter, you need a context and an arraylist
    //controls how this are displayed on your screen
    //instance variables
    private Context myContext;
    private ArrayList<contact> myContacts = new  ArrayList<contact>();

    //constructor
    public ContactAdapter(Context myContext, ArrayList<contact> myContacts){
        //super is a keyword referencing to extends
        super(myContext,0,myContacts);
        this.myContacts = myContacts;
        this.myContext = myContext;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(myContacts== null){
            //LayoutInFlater will inflate it onto different screen sizes (allows to fit on different screens)
            //if there's nothing to display, display nothing; to avoid code from crashing
            convertView= LayoutInflater.from(myContext).inflate(R.layout.contact_item,parent,false);
        }
        contact currentContact  = myContacts.get(position);
        //starting to link views and setting resources
        //findViewById only works in onCreate, we need to use convertView to use this code
        ImageView profilePic = convertView.findViewById(R.id.profilePic);
        TextView name = convertView.findViewById(R.id.name);
        TextView number= convertView.findViewById(R.id.number);
        //get.Name() = method that returns the name; getter from contacts class
        name.setText(currentContact.getName());
        profilePic.setImageResource(currentContact.getProfilePic());
        number.setText(currentContact.getNumber());
        return convertView;
    }
}
