package com.week_01;
/*5.2. Вычислить факториал числа.*/

import java.util.Scanner;

public class Solution_5_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        long faktorial = 1;
        for (int i = 1; i <= number; i++){
            faktorial *=i;
        }
        System.out.printf("Факториал числа %d = %d", number, faktorial);
    }
}
