package com.week_02;

/**
 * Return a version of the given string, where for every star (*) in the string the star
 * and the chars immediately to its left and right are gone.
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 */
public class Solution_06_07 {
    public static String starOut(String str1){
        StringBuilder strBuilder = new StringBuilder(str1);
        int index;
        int i = 0;
        while (true){
            index = str1.indexOf('*', i);
            if (index < 0) break;
            if (index > 0 && index < str1.length()){
                do{
                    strBuilder.replace(index - 1, index + 1, "");
                }
                while (str1.charAt(index + 1) == '*');


            }
            i = index + 1;
        }

        return strBuilder.toString();
    }
    public static void main(String[] args) {
        System.out.println(starOut("abc*wrd*ytdgd*dgf"));
    }
}
