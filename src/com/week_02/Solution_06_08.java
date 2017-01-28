package com.week_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Return the number of times that the string "hi" appears anywhere in the given string.
 */
public class Solution_06_08 {
    public static int countHi(String str1){
        Matcher m = Pattern.compile("hi").matcher(str1);
        int i = 0;
        while (m.find()) i++;
        return i;
    }

    public static void main(String[] args) {
        System.out.println(countHi("hihi"));
    }
}
