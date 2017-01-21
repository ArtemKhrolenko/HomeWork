package com.week_02;

/**
 * Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back.
 * The string will be non-empty.
 */
public class Solution_05_02_05 {
    public static String theEnd(String str1, boolean bool){
        return bool? str1.substring(0,1) : str1.substring(str1.length() - 1);
    }
    public static void main(String[] args) {
        System.out.println(theEnd("Hello", false));
    }
}
