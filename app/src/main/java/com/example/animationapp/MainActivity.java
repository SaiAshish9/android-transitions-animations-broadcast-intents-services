package com.example.animationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = new Intent(this,MyService.class);
        startService(intent);


    }

    public void onclick(View v){

        Intent i = new Intent(this,ActivityTwo.class);
        final EditText firstInp = (EditText) findViewById(R.id.firstInp);
        String userMessage = firstInp.getText().toString();
        i.putExtra("userMsg",userMessage);
        startActivity(i);

    }


}