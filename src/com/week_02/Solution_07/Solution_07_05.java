package com.week_02.Solution_07;

/**
 Заменить в строке все символы 'a' на '@' и вывести новую строку // "array is a data type" -> "@rr@y is @ d@t@ type"
 */
public class Solution_07_05 {
    public static String replaceSym(String str1, char fromSym, char toSym){

        return str1.replaceAll(String.valueOf(fromSym), String.valueOf(toSym));
    }
    public static void main(String[] args) {
        System.out.println(replaceSym("array is a data type", 'a', '@'));
    }
}
