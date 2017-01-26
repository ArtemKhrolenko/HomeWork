package com.week_02;

/**
 * Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
 * You may assume that n is between 0 and the length of the string, inclusive.
 */
public class Solution_06_04 {
    public static String repeatEnd(String str1, int n){
        StringBuilder strBuilder = new StringBuilder("");
        for (int i = 0; i < n; i++){
            strBuilder.append(str1, str1.length() - n, str1.length());
        }
        return strBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 4));

    }
}
