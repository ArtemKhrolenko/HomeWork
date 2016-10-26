package com.week_01;

import java.util.Scanner;
/*Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.*/

public class Solution_4_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        if (sum >= 11 && sum <= 19 ){
            System.out.println(number1 + number2);
        }
    }
}
