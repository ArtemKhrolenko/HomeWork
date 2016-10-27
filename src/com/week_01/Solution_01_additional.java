package com.week_01;

import java.util.Scanner;

/*1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
        лить, является ли он прямоугольным. Ответ вывести в виде сообщения.*/

public class Solution_01_additional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println((a*a + b*b == Math.round(c*c) || a*a + c*c == Math.round(b*b) || c*c + b*b == Math.round(a*a))? "Треугольник - прямоугольный" : "Треугольник не прямоугольный");
    }
}
