package com.week_02.Solution_05;

/**
 * Given an "out" string length 4, such as "<<>>", and a word, return a new string where
 * the word is in the middle of the out string, e.g. "<<word>>".
 * Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
 */
public class Solution_05_02_02 {
    public static String makeOutWord (String str1, String str2){

        return str1.substring(0, 2) + str2 + str1.substring(2);
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("{{}}", "Yey"));
    }
}
