package com.raph.bubbletest;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;

/**
 * Created by Raph on 15/05/2017.
 */

public class BubbleDrawable extends GradientDrawable {

    public BubbleDrawable(int pStartColor, int pCenterColor, int pEndColor, int pStrokeWidth, int pStrokeColor) {
        super(Orientation.BOTTOM_TOP,new int[]{pStartColor,pCenterColor,pEndColor});
        setStroke(pStrokeWidth,pStrokeColor);
        setShape(GradientDrawable.OVAL);
    }

}