package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickMyButton(View v){

        long x = System.currentTimeMillis()+100000;

        while (System.currentTimeMillis()<x){

            synchronized (this){
                try {

                    wait(x-System.currentTimeMillis());

                }catch (Exception e){

                }
            }
        }

        TextView tv=(TextView) findViewById(R.id.textView);
        tv.setText("btn clicked");

    }

}