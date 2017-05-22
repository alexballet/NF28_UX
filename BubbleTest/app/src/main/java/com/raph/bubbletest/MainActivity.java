package com.raph.bubbletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    CustomDrawableView mCustomDrawableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCustomDrawableView = new CustomDrawableView(this);

        //setContentView(R.layout.activity_main);
        BubbleLockDrawable vDrawable = new BubbleLockDrawable(1,1);
        View vView = new View(this);
        vView.setBackground(vDrawable);
        View mainView = new View(this);
        setContentView(mainView);
        addContentView(vView, new ViewGroup.LayoutParams(300,300));
    }
}



