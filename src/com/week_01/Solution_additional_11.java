package com.week_01;

import java.util.Scanner;

/**
 11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
 добавляет к нему слово "копейка" в правильной форме. Например, 1
 копейка, 5 копеек, 42 копейки .
 */
public class Solution_additional_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество копеек:");
        int coins = scanner.nextInt();
        int rest = coins % 10;
        System.out.println(coins + (rest == 0 || (rest > 4 && rest <= 9) ? " копеек" : rest == 1 ? " копейка" : " копейки"));
    }
}
