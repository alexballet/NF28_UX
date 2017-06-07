package com.raph.bubbletest;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.raph.bubbletest.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    CustomDrawableView mCustomDrawableView;

    Model model = Model.getInstance();

    int lockNumber=5;
    int x_ctr = 500;
    int y_ctr = 800;
    int radius = 200;

    String STRING = "MainActivity";

    double currentBubble_x;
    double currentBubble_y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCustomDrawableView = new CustomDrawableView(this);

        // create test bubbleLocks
        for(Integer i=0; i<lockNumber; i++){
            Lock l = new Lock();
            Color col = new Color();
            List<BubbleLock> bubbleLockList = new ArrayList<BubbleLock>();

            BubbleLock bubbleLock = new BubbleLock(BubbleLock.randomColor(), l);
            bubbleLockList.add(bubbleLock);
            if (i%2==1) {
                BubbleLock bubbleLock2 = new BubbleLock(BubbleLock.randomColor(), l);
                bubbleLockList.add(bubbleLock2);
            }
            BubbleLockGroup bubbleLockGroup = new BubbleLockGroup("test", bubbleLockList);
            model.bubbleLockGroupList.add(bubbleLockGroup);
        }

        //position par rapport au centre:
        //nLocks, autour d'un cercle de rayon r, de centre (x_ctr,y_ctr)
        //pour le lock numéro i (de 0 à nLocks-1), ses coordonnées sont :
        // (x_ctr + r * cos(i*(360/nLocks)),y_ctr + r * sin(i*(360/nLocks)))
        //le premier lock sera à droite, il suffit de faire une soration de 90° pour les nLocks > 2
        double angle = (Math.PI * 2) / lockNumber;
        double offset =Math.PI/2; //déclaer de pi/2 si ockNumber>=2;
        if(lockNumber == 2)
            offset=0;

        setContentView(R.layout.activity_main);

        for(Integer i=0; i<lockNumber; i++){
            Lock l = new Lock();
            Color col = new Color();

            List<BubbleLock> bubbleLockList = new ArrayList<BubbleLock>();

            BubbleLock bubbleLock = new BubbleLock(BubbleLock.randomColor(), l);
            bubbleLockList.add(bubbleLock);
            if (i%2==1) {
                BubbleLock bubbleLock2 = new BubbleLock(BubbleLock.randomColor(), l);
                bubbleLockList.add(bubbleLock2);
            }
            BubbleLockGroup bubbleLockGroup = new BubbleLockGroup("test", bubbleLockList);
            model.bubbleLockGroupList.add(bubbleLockGroup);


            BubbleLockDrawable bubbleDrw = new BubbleLockDrawable(20*i, bubbleLockGroup);
            View currentBubbleView = new View(this);
            currentBubbleView.setBackground(bubbleDrw);
            currentBubble_x = x_ctr + radius * Math.cos(angle * i -offset);
            currentBubble_y = y_ctr + radius * Math.sin(angle * i - offset);

            currentBubbleView.setX((float)currentBubble_x);
            currentBubbleView.setY((float)currentBubble_y);
            addContentView(currentBubbleView, new ViewGroup.LayoutParams(100,100));

            Log.d(STRING,"current Bubble coordinates: ("+currentBubble_x+","+currentBubble_y+")");
            Log.d(STRING,currentBubbleView.toString());
        }

        //BubbleLockDrawable vDrawable = new BubbleLockDrawable(1,1);
        //View bubbleView = new View(this);
        //bubbleView.setBackground(vDrawable);
        //View mainView = new View(this);
        //setContentView(mainView);
        //addContentView(bubbleView, new ViewGroup.LayoutParams(200,200));

        setContentView(R.layout.activity_main);

    }
}



