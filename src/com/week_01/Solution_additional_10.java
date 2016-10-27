package com.week_01;

import java.util.Scanner;

/**
 10) Написать программу вычисления стоимости переговоров, если по суббо-
 там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
 ность разговора и день недели (цифра от 1 до 7).
 */
public class Solution_additional_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tarif = 2.5; // UAH/min

        System.out.println("Введите день недели:");
        int dayOfWeek = scanner.nextInt();

        if (dayOfWeek < 1 || dayOfWeek > 7){
            System.out.println("Некорректно введен день недели");
            return;
        }

        System.out.println("Введите продолжительность разговора в минутах:");
        int minutes = scanner.nextInt();

        System.out.printf("Стоимость переговоров = %.2f UAH", dayOfWeek < 6 ? tarif * minutes : tarif * minutes * 0.8);

    }
}
