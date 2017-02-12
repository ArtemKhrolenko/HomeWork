package com.week_02.Solution_05;

/**
 * Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
 */
public class Solution_05_02_09 {
    public static String seeColor(String str1){
        return (str1.contains("red")  && str1.indexOf("red")  == 0) ? "red"  : (str1.contains("blue") && str1.indexOf("blue") == 0) ? "blue" : "";
    }
    public static void main(String[] args) {
        System.out.println(seeColor("redTimes"));
    }
}
