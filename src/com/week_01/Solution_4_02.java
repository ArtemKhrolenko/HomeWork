package com.week_01;

import java.util.Scanner;
/*Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее*/

public class Solution_4_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        System.out.println("Введите 3 числа:");
        for (int i = 0; i < 3; i++){
            int num = scanner.nextInt();
            if (num > maxVal)
                maxVal = num;
            if (num < minVal)
                minVal = num;
        }
        System.out.println("Наименьшее : " + minVal);
        System.out.println("Наибольшее : " + maxVal);
    }
}
