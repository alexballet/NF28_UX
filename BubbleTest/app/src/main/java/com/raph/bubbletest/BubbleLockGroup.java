package com.raph.bubbletest;

import java.util.List;

/**
 * Created by Alxd on 22/05/2017.
 */

public class BubbleLockGroup {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private List<BubbleLock> bubblelocks;

    public List<BubbleLock> getBubbleLocks() {
        return bubblelocks;
    }

    public void setLocks(List<BubbleLock> bubblelocks) {
        this.bubblelocks = bubblelocks;
    }

    public BubbleLockGroup(String name, List<BubbleLock> bubblelocks) {
        this.bubblelocks = bubblelocks;
        this.name = name;
    }
}
