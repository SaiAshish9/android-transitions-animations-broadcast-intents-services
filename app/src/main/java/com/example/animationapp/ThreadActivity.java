package com.example.animationapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ThreadActivity extends AppCompatActivity{


    Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            TextView tv=(TextView) findViewById(R.id.myText);
            tv.setText("btn clicked");
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ClickMyButton(View v){

        Runnable r = new Runnable() {
            @Override
            public void run() {
                long x = System.currentTimeMillis()+10000;
                while (System.currentTimeMillis()<x){
                    synchronized (this){
                        try {
                            wait(x-System.currentTimeMillis());
                        }catch (Exception e){ }
                    }
                }
            handler.sendEmptyMessage(0);
            }
        };

        Thread myThread = new Thread(r);
        myThread.start();


//        long x = System.currentTimeMillis()+10000;
//        while (System.currentTimeMillis()<x){
//            synchronized (this){
//                try {
//
//                    wait(x-System.currentTimeMillis());
//
//                }catch (Exception e){
//
//                }
//            }
//        }



        //        application crashes due to overload on main thread
        //        which contains code which we need to execute inside another thread.

    }

}