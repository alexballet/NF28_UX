package com.raph.bubbletest;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
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
    int lockNumber = 3;

    Model model = Model.getInstance();

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

        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        gridview.setNumColumns(model.bubbleLockGroupList.size() >= 3 ? 3 : model.bubbleLockGroupList.size());
        gridview.setPadding(0,0,0,0);
        gridview.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    return true;
                }
                return false;
            }

        });

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), SingleViewActivity.class);
                // Pass image index
                i.putExtra("id", position);
                startActivity(i);
            }
        });
    }
}



