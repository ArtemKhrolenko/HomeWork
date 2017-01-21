package com.week_02;

/**
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
 * If either string is length 0, use '@' for its missing char.
 */
public class Solution_05_02_08 {
    public static String lastChars(String str1, String str2){
        String s1 = str1.isEmpty()? "@" : str1.substring(0,1);
        String s2 = str2.isEmpty()? "@" : str2.substring(str2.length() - 1);
        return s1 + s2;
    }
    public static void main(String[] args) {
        System.out.println(lastChars("", ""));
    }
}
