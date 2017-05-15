package com.raph.bubbletest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CustomDrawableView mCustomDrawableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCustomDrawableView = new CustomDrawableView(this);

        //setContentView(R.layout.activity_main);
        BubbleDrawable vDrawable = new BubbleDrawable(Color.BLACK,Color.GREEN,Color.LTGRAY,2,Color.RED,50);
        View vView = new View(this);
        vView.setBackgroundDrawable(vDrawable);
        setContentView(vView);
    }
}



