package com.week_02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
 */
public class Solution_07_03 {
    public static void countA(String str1, String symbol){
        Matcher m = Pattern.compile(symbol).matcher(str1);
        int i = 0;
        while (m.find()) i++;
        System.out.printf("There are %d symbols %s in string", i, symbol);

    }
    public static void main(String[] args) {
        System.out.print("Enter the symbol: ");
        Scanner scanner = new Scanner(System.in);
        countA("ddadaadadsad", scanner.next());
    }
}
