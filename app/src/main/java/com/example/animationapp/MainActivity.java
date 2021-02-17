package com.example.animationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity{

    ViewGroup myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = (ViewGroup) findViewById(R.id.layout);

        myLayout.setOnTouchListener(
                new RelativeLayout.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        moveButton();
                        return true;
                    }
                }
        );

    }
    public void moveButton(){

        View myBtn = findViewById(R.id.button);
        RelativeLayout.LayoutParams positionRules = new RelativeLayout.LayoutParams(
          RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        positionRules.addRule(
                RelativeLayout.ALIGN_PARENT_BOTTOM,
                RelativeLayout.TRUE
        );
        myBtn.setLayoutParams(positionRules);

        ViewGroup.LayoutParams sizeRules = myBtn.getLayoutParams();
        sizeRules.height = 300;
        sizeRules.width = 450;
        myBtn.setLayoutParams(sizeRules);


    }
}