package com.week_01;

import java.util.Scanner;

/**
 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
 */
public class Solution_additional_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Скорость: ");
        double velocity = scanner.nextDouble();
        System.out.println("Расстояние: ");
        double distance = scanner.nextDouble();
        System.out.printf("Время преодоления расстояния: %.2f", distance / velocity);
    }
}
