package com.week_01;

import java.util.Scanner;
/*Пользователь вводит параметр с консоли (текущий час от 0 до 24)
				Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")*/

public class Solution_4_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время (час)");
        int time = scanner.nextInt();
        if (time >= 0 && time <=24 ){
            if (time >= 9 && time <= 18)
                System.out.println("Я на работе");
            else
                System.out.println("Я отдыхаю");
        }
        else
            System.out.println("Некорректно введенные данные");
    }
}
