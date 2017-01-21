package com.week_02;

/**
 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
 */
public class Solution_05_02_04 {
    public static String nonStart(String str1, String str2){
        return str1.substring(1) + str2.substring(1);
    }
    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
    }
}
