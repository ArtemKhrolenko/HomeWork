package com.week_03;

/**
 * Написать метод, который проверяет является ли строка палиндромом
 */
public class Solution_03_3 {
    public static boolean isPalindrom(String str1){

        return str1.replaceAll(" ", "").equals(new StringBuilder(str1).reverse().toString().replaceAll(" ",""));
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom("a roza upala na lapu azora"));
    }
}
