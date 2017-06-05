package com.raph.bubbletest;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/**
 * Created by Raph on 15/05/2017.
 */

public class BubbleLockDrawable extends ShapeDrawable {

    public BubbleLockDrawable(int color, int size) {
        setShape(new OvalShape());
        setIntrinsicHeight (size);
        setIntrinsicWidth (size);
        getPaint().setARGB(255,66+color, 170-color/2, 244);
    }

}