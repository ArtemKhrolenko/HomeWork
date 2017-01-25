package com.week_02;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Return the number of times that the string "code" appears anywhere in the given string,
 * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
 */
public class Solution_06_02 {
    public static int countCode(String str1){
        Pattern p = Pattern.compile("co.e");
        Matcher m = p.matcher(str1);
        int i = 0;
        while(m.find()) {
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(countCode("cozexxcopecopecofecoje"));
    }
}
