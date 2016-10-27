package com.week_01;

import java.util.Scanner;

/**
 12) Написать программу, которая в зависимости от характера ветра выдает
 сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
 умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
 */
public class Solution_additional_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числовое значение для скорости ветра (1 - 4):");
        int wind = scanner.nextInt();
        String characterOfWind = "";
        switch (wind){
            case 1:
                characterOfWind = "Слабый";
                break;
            case 2:
                characterOfWind = "Умеренный";
                break;
            case 3:
                characterOfWind = "Сильный";
                break;
            case 4:
                characterOfWind = "Ураганный";
                break;
        }
        System.out.println(characterOfWind);

    }
}
