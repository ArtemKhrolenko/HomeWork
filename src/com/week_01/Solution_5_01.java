package com.week_01;

import java.util.Scanner;

/*5.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число*/
public class Solution_5_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;

        System.out.println("Выберите направление перевода: 1 - Двоичная - Десятичная; 2 - Десятичная - двоичная");
        int choice = scanner.nextInt();
        System.out.println("Введите число:");
        number = scanner.next();

        if (choice == 1 && number.matches("[0-1]+")){   //Из двоичной в десятичную. Проверка на правильность введенных данных
            int result = 0;
            for (int i = 0; i < number.length(); i++){
                if (number.charAt(i) == '1')
                 result += Math.pow(2, (number.length() - 1) - i);
            }
            System.out.printf("Результат: %d", result);
        }

        if (choice == 2){   // Из десятичной в двоичную
            int intNum = Integer.parseInt(number);
            String result = "";
            do{
                result += intNum % 2;
                intNum /= 2;
            }
            while (intNum > 0);
            System.out.println("Результат: " + new StringBuilder(result).reverse());
        }
    }
}
