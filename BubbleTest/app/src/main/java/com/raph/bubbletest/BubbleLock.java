package com.raph.bubbletest;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Alxd on 15/05/2017.
 */

public class BubbleLock {

    private List<Integer> ARGBcolor;

    private Lock lock;

    public List<Integer> getColor() {
        return ARGBcolor;
    }

    public void setColor(List<Integer> argb) {
        this.ARGBcolor = argb;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public BubbleLock(List<Integer> argb, Lock lock) {
        this.ARGBcolor = argb;
        this.lock = lock;
    }

    public static List<Integer> randomColor() {

        List<Integer> argb = new ArrayList<>();
        argb.add(255);
        Random random = new Random();
        argb.add(random.nextInt(256));
        argb.add(random.nextInt(256));
        argb.add(random.nextInt(256));

        return argb;
    }
}