package com.week_03;

/**
 *  Найти самое длинное слово в строке(разделенное одним пробелом)
 */
public class Solution_03_7 {
    public static String longestWord(String str){
        String[] arrayString = str.split(" ");
        String maxString = "";
        for (String elem: arrayString){
            if (elem.length() > maxString.length())
                maxString = elem;
        }

        return maxString;
    }
    public static void main(String[] args) {
        System.out.println("Longest word: " + longestWord("Mama mila ramuuuu asdfghhjk"));
    }
}
