package com.raph.bubbletest;

import android.graphics.Color;

/**
 * Created by Alxd on 15/05/2017.
 */

public class BubbleLock {

    private Color color;

    private Lock lock;

    public BubbleLock(Color color, Lock lock) {
        this.color = color;
        this.lock = lock;
    }
}