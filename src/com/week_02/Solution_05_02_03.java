package com.week_02;

/**
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 */
public class Solution_05_02_03 {
    public static String firstHalf(String str1){
        return str1.substring(0, str1.length() / 2);
    }
    public static void main(String[] args) {
        System.out.println(firstHalf("HelloThere"));
    }
}
