package com.week_02;

/**
 * Given a string, consider the prefix string made of the first N chars of the string.
 * Does that prefix string appear somewhere else in the string?
 * Assume that the string is not empty and that N is in the range 1..str.length().
 */
public class Solution_06_05 {
    public static boolean prefixAgain(String str1, int n){
        return str1.substring(n, str1.length()).contains(str1.substring(0, n));
    }
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 3));
    }
}
