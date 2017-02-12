package com.week_02.Solution_05;

/**
 * Given a string, return true if it ends in "ly"
 */
public class Solution_05_02_06 {
    public static boolean endsLy(String str1){
        return str1.endsWith("ly");
    }
    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
    }
}
