package com.week_01;

import java.util.Scanner;
/*Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
				в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)*/

public class Solution_4_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 % number2 == 0){
            System.out.printf("true. %d / %d. Целая часть: %d, Остаток: 0, \n", number1, number2, number1 / number2);
        }
        else{
            if (number2 % number1 == 0){
                System.out.printf("true. %d / %d. Целая часть: %d, Остаток: 0, \n", number2, number1, number2 / number1);
            }
            else {
                System.out.printf("false. %d / %d. Целая часть: %d, Остаток: %d, \n", number1, number2, number1 / number2, number1 % number2);
                System.out.printf("false. %d / %d. Целая часть: %d, Остаток: %d", number2, number1, number2 / number1, number2 % number1);
            }
        }
    }
}

