package com.example.animationapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG ="com.example.animationapp";

    public MyService() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"onStart called");
        Runnable r=  new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    long future = System.currentTimeMillis()+5000;
                    while (System.currentTimeMillis()<future){
                        synchronized (this){
                            try {
                                wait(future-System.currentTimeMillis());
                                Log.i(TAG,"service running");
                            }catch (Exception e){

                            }
                        }
                    }
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"onDestroy Called");
    }


    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}