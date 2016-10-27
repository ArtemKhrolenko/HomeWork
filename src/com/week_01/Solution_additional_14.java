package com.week_01;

import java.util.Scanner;

/**
 14) Определить, является ли шестизначное число "счастливым" (сумма
 первых трех цифр равна сумме последних трех цифр).
 */
public class Solution_additional_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите шестизначное число: ");
        String number = scanner.next();
        int sum_01 = 0;
        int sum_02 = 0;
        for (int i = 0; i < number.length() / 2; i++){
            sum_01 += Integer.parseInt(String.valueOf(number.charAt(i)));
            sum_02 += Integer.parseInt(String.valueOf(number.charAt(number.length() - i - 1)));
        }
        System.out.println("Сумма первых цифр = " + sum_01);
        System.out.println("Сумма последних цифр = " + sum_02);
        System.out.printf("Билет - %s", sum_01 == sum_02 ? "Счастливый" : "Не счастливый");
    }
}
