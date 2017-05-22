package com.raph.bubbletest;

import android.content.ClipData;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Alxd on 22/05/2017.
 */

public class CustomTouchListener implements View.OnTouchListener {

    public boolean onTouch(View view, MotionEvent motionEvent) {

        if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(
                    view);
            view.startDrag(data, shadowBuilder, view, 0);
            view.setVisibility(View.INVISIBLE);
            return true;
        } else {
            return false;
        }
    }
}
