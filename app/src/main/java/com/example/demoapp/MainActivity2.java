package com.example.demoapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.demoapp.databinding.ActivityMain2Binding;
import com.example.demoapp.databinding.ActivityMainBinding;

public class MainActivity2 extends AppCompatActivity {

    Contact mContact;

    ActivityMain2Binding activityMain2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setData();
        activityMain2Binding = DataBindingUtil.setContentView(this,R.layout.activity_main2);

        activityMain2Binding.setContact(mContact);

    }


    private void setData(){
        Contact contact = new Contact(1,"Alexa");

        mContact = contact;
    }



}
