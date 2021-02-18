package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onclick(View v){

        Intent i = new Intent(this,ActivityTwo.class);
        final EditText firstInp = (EditText) findViewById(R.id.firstInp);
        String userMessage = firstInp.getText().toString();
        i.putExtra("userMsg",userMessage);
        startActivity(i);

    }


}