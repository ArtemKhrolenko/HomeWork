package com.week_01;

import java.util.Scanner;
/*Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.*/

public class Solution_4_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        if (number % 7 == 0)
            System.out.println(number * 2);
    }
}
