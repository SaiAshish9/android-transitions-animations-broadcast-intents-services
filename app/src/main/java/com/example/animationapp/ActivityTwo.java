package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Bundle firstData = getIntent().getExtras();
        if(firstData==null){
            return;
        }
        String x = firstData.getString("userMsg");
        final TextView secondText = (TextView) findViewById(R.id.textView);
        secondText.setText(x);

    }



}