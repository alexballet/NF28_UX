package com.raph.bubbletest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alxd on 29/05/2017.
 */

public class Model {

    public static List<BubbleLockGroup> bubbleLockGroupList = new ArrayList<BubbleLockGroup>();

    private static Model instance;

    public static void initInstance()
    {
        if (instance == null)
        {
            // Create the instance
            instance = new Model();
        }
    }

    public static Model getInstance()
    {
        // Return the instance
        return instance;
    }

    private Model()
    {
        // Constructor hidden because this is a singleton
    }

}
