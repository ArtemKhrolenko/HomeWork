package com.week_01;

import java.util.Scanner;

/**
 4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
 ду. Какая из них больше?
 */
public class Solution_additional_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость в км/час");
        double kmHourSpeed = scanner.nextDouble();
        System.out.println("Введите скорость в м/с");
        double mSecondSpeed = scanner.nextDouble();

        System.out.println(mSecondSpeed / 1000 * 3600 > kmHourSpeed ? "Скорость в м/c - больше" : "Скорость в км/час - больше");
    }

}
