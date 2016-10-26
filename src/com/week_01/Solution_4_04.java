package com.week_01;

import java.util.Scanner;
/*Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1*/

public class Solution_4_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: с плавающей точкой");
        double number = scanner.nextDouble();
        if (number >= 0 && number <= 1)
            System.out.println("В диапазоне 0...1");
        else
            System.out.println("За пределами диапазона 0...1");
    }
}

