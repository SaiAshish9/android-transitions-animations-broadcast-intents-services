package com.example.animationapp;

import android.annotation.SuppressLint;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyIntentService extends IntentService {

    private static final String TAG = "com.example.animationapp";

    public MyIntentService() {
        super("MyIntentService");
    }

    @SuppressLint("LongLogTag")
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.i(TAG,"service started");
    }
}
