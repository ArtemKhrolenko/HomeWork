package com.week_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char
 */
public class Solution_06_03 {

    public static boolean bobThere(String str1){
        Pattern p = Pattern.compile("b.b");
        Matcher m = p.matcher(str1);
        return Pattern.compile("b.b").matcher(str1).find();

    }

    public static void main(String[] args) {
        System.out.println(bobThere("bibd"));
    }
}
