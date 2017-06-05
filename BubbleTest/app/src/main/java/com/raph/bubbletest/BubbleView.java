package com.raph.bubbletest;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.content.Context;
import android.graphics.Canvas;

/**
 * Created by Raph on 29/05/2017.
 */

public class BubbleView extends View {
    private ShapeDrawable mDrawable;

    public BubbleView(Context context) {
        super(context);
    }

    public BubbleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BubbleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {
        //instructions communes à tous les constructeurs
        int x = 10;
        int y = 10;
        int width = 50;
        int height = 50;

        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(0xff740C23);
        mDrawable.setBounds(x, y, x + width, y + height);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        // Drawing commands go here
    }
}
