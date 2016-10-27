package com.week_01;

import java.util.Scanner;

/**
 8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
 тавляется, если сумма покупки превышает 1000 гривен.
 */
public class Solution_additional_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму покупки:");
        double total = scanner.nextDouble();
        System.out.print("Стоимость покупки составляет: ");
        System.out.println(total > 1000 ? total * 0.9: total);
    }
}
