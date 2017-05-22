package com.raph.bubbletest;

import java.util.List;

/**
 * Created by Alxd on 22/05/2017.
 */

public class BubbleLockGroup {

    private List<BubbleLock> locks;

    public List<BubbleLock> getLocks() {
        return locks;
    }

    public void setLocks(List<BubbleLock> locks) {
        this.locks = locks;
    }

    public BubbleLockGroup(List<BubbleLock> locks) {
        this.locks = locks;
    }
}
