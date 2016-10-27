package com.week_01;

import java.util.Scanner;

/**
 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
 одинаковые; б) есть ли среди его цифр одинаковые.
 */
public class Solution_additional_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        String number = scanner.next();
        boolean a = false;
        boolean b = false;
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < number.length(); i++){
            newString.append(number.charAt(0));
        }
        if (number.equals(newString.toString())){
            a = true;
            b = true;
        } else {
            for (int i = 0; i < number.length() - 1; i++){
                if (number.substring(i + 1).contains(String.valueOf(number.charAt(i)))){
                    b = true;
                    break;
                }

            }
        }
        System.out.printf("Все цифры одинаковы: %b;\nНаличие одинаковых цифр: %b", a, b);
    }
}
