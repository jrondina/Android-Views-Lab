package com.example.jamesrondina.activitylab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class JailActivity extends AppCompatActivity {


    public static final String firstName = "First Name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jail);

        Intent intent = getIntent();
        int id = intent.getIntExtra(firstName, 0);
        String last = intent.getStringExtra("Last Name");




        //EditText editText = findViewById();
        //editText.getText().toString();
    }




}
