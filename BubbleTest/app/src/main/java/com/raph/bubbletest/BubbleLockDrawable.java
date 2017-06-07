package com.raph.bubbletest;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/**
 * Created by Raph on 15/05/2017.
 */

public class BubbleLockDrawable extends ShapeDrawable {

    public BubbleLockDrawable(int size, BubbleLockGroup bubbleLockGroup) {
        setShape(new OvalShape());
        setIntrinsicHeight (size);
        setIntrinsicWidth (size);

        if (bubbleLockGroup.getBubbleLocks().size() == 1) {
            getPaint().setARGB(bubbleLockGroup.getBubbleLocks().get(0).getColor().get(0), bubbleLockGroup.getBubbleLocks().get(0).getColor().get(1), bubbleLockGroup.getBubbleLocks().get(0).getColor().get(2), bubbleLockGroup.getBubbleLocks().get(0).getColor().get(3));
        } else {
            getPaint().setARGB(255,0, 0, 0);
        }

    }

}