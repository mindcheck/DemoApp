package com.example.demoapp;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Contact extends BaseObservable {

    private int id;

    private String name;


    public Contact(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Bindable
    public int getId() {
        return id;
    }



    public void setId(int id) {

        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
