package com.week_02;

/**
 * Return a version of the given string, where for every star (*) in the string the star
 * and the chars immediately to its left and right are gone.
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 */
public class Solution_06_07 {
    public static String starOut(String str1){
        return str1.replaceAll(".{1}\\*+.{1}", "");
    }
    public static void main(String[] args) {
        System.out.println(starOut("12***3456**789**0"));
    }
}
