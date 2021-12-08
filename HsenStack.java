/*
* This program is a stack class.
*
* @author  Hsen Mansour
* @version 1.0
* @since   2021-12-07
*/

/**
* Info about this package doing something for package-info.java file.
*/
package com.intertech.cms.domain;

import java.util.ArrayList;

public class HsenStack {
    /**
    * Function adds value to stack.
    *
    * @param pushValue
    */
    public void push(final int pushValue) {
        stack.add(pushValue);
    }

    /**
    * Prints stack.
    */
    public void showStack() {
        System.out.println(stack);
    }

    /**
    * Stack vareable.
    */
    private ArrayList<Integer> stack = new ArrayList<Integer>();
}
