package com.raph.bubbletest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CustomDrawableView mCustomDrawableView;
    int lockNumber=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCustomDrawableView = new CustomDrawableView(this);

        List<BubbleLock> bubbleList = new ArrayList<BubbleLock>();
        for(Integer i=0; i<lockNumber; i++){
            Lock l = new Lock();
            Color col = new Color();
            BubbleLock bubbleLock = new BubbleLock(col,l);
            bubbleList.add(bubbleLock);
        }
        setContentView(R.layout.activity_main);
        BubbleLockDrawable vDrawable = new BubbleLockDrawable(1,1);
        View vView = new View(this);
        vView.setBackground(vDrawable);
        View mainView = new View(this);
        //setContentView(mainView);
        addContentView(vView, new ViewGroup.LayoutParams(300,300));
    }
}



