package com.week_01;

import java.util.Scanner;

/**
 9) Написать программу вычисления идеального веса пользователя (рост-
 100). Выдать рекомендации о необходимости поправиться либо поху-
 деть.
 */
public class Solution_additional_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой рост:");
        double height = scanner.nextDouble();
        System.out.println("Введите свой вес:");
        double weight = scanner.nextDouble();
        System.out.printf("Идеальный вес для вас: %.2f кг. Вам необходимо %s", height - 100, weight > height - 100 ? "похудеть" : "поправиться");
    }
}
