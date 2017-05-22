package com.raph.bubbletest;

import java.util.List;

/**
 * Created by Alxd on 22/05/2017.
 */

public class BubbleLockGroup {

    private List<BubbleLock> bubblelocks;

    public List<BubbleLock> getBubbleLocks() {
        return bubblelocks;
    }

    public void setLocks(List<BubbleLock> bubblelocks) {
        this.bubblelocks = bubblelocks;
    }

    public BubbleLockGroup(List<BubbleLock> bubblelocks) {
        this.bubblelocks = bubblelocks;
    }
}
