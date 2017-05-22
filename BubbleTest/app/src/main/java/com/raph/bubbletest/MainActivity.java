package com.raph.bubbletest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    CustomDrawableView mCustomDrawableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCustomDrawableView = new CustomDrawableView(this);

        //setContentView(R.layout.activity_main);
        BubbleDrawable vDrawable = new BubbleDrawable(1,1);
        View vView = new View(this);
        vView.setLayoutParams(new ViewGroup.LayoutParams(300, 300));
        vView.setBackground(vDrawable);
        vView.setOnTouchListener(new CustomTouchListener());
        setContentView(vView);
    }
}



