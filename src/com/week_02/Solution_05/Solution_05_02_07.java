package com.week_02.Solution_05;

/**
 *
 Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
 */
public class Solution_05_02_07 {
    public static String middleThree(String str1){
        return str1.substring(str1.length() / 2 - 1, str1.length() / 2 + 2);
    }
    public static void main(String[] args) {
        System.out.println(middleThree("solving"));

    }
}
