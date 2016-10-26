package com.week_01;

import java.util.Scanner;
/*Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.*/

public class Solution_4_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2){
            System.out.printf("Разница = %d", number1 - number2);
        }
        else if (number2 > number1)
            System.out.printf("Сумма = %d", number1 + number2);
    }
}
