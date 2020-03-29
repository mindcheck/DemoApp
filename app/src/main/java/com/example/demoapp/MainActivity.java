package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.demoapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


//    Button button;
//    TextView tvCount;
    MainActivitytViewModel mainActivitytViewModel;

    ActivityMainBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

//        tvCount = (TextView) findViewById(R.id.tv_count);
//        button = (Button) findViewById(R.id.button);


        mainActivitytViewModel = new ViewModelProvider(this).get(MainActivitytViewModel.class);

        mainActivitytViewModel.getMutableLiveData().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
               setCount(integer);
            }
        });

        mainActivitytViewModel.getInitialCount();


//        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            }
//        });

        activityMainBinding.setClickHandler(new ClickHandler());

    }




    private void setCount(Integer integer){


        activityMainBinding.setStudent("Count is  = "+integer);

//        tvCount.setText();
    }



    public class ClickHandler {

       public void onButtonClick(View view){
            mainActivitytViewModel.getCurrentCount();
        }
    }


}
