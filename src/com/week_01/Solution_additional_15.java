package com.week_01;

import java.util.Scanner;

/**
 15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
 квадрат; б) уместится ли квадрат в круге.
 */
public class Solution_additional_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите площадь квадрата:");
        double squareSquare = scanner.nextDouble();
        System.out.println("Введите площадь круга");
        double squareCircle = scanner.nextDouble();

        double squareSide = Math.pow(squareSquare, 0.5);
        double circleRadius = Math.pow(squareCircle / 3.14, 0.5);
        double squareDiagan = Math.pow(squareSide * squareSide * 2, 0.5);

        if (squareSide >= circleRadius * 2)
            System.out.println("Круг уместится в квадрате. Квадрат не уместится в круге");
        else if(squareSide < circleRadius * 2 && squareDiagan <= circleRadius * 2)
            System.out.println("Круг не уместится в квадрате. Квадрат уместится в круге");
        else
            System.out.println("Круг не уместится в квадрате. Квадрат не уместится в круге");
    }
}
