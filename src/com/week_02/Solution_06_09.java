package com.week_02;

/**
 *
 Given two strings, return true if either of the strings appears at the very end
 of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 Note: str.toLowerCase() returns the lowercase version of a string.
 */
public class Solution_06_09 {
    public static boolean endOther(String str1, String str2){
        return str1.toLowerCase().endsWith(str2.toLowerCase()) || str2.toLowerCase().endsWith(str1.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(endOther("abc", "abXabc"));
    }
}
