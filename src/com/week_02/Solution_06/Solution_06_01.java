package com.week_02.Solution_06;

/**
 * Given a string, return a string where for every char in the original, there are two chars.
 */
public class Solution_06_01 {
    public static String doubleChar(String str1){
        String resultStr = "";
        for (char elem: str1.toCharArray()){
            for (int i = 0; i < 2; i++)
                resultStr += String.valueOf(elem);
        }
        return resultStr;
    }
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
    }
}
