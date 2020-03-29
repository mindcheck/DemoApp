package com.example.demoapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivitytViewModel extends ViewModel {

    public MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();

    private int count = 0;

    public void getCurrentCount(){
        count++;
        mutableLiveData.setValue(count);
    }

    public void getInitialCount(){

        mutableLiveData.setValue(count);
    }

    public MutableLiveData<Integer> getMutableLiveData() {
        return mutableLiveData;
    }


}
