package com.week_01;

import java.util.Scanner;

/**
 5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
 пара равных
 */
public class Solution_additional_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intarray = new int[3];
        System.out.println("Введите три исла: ");
        for (int i = 0; i < intarray.length; i++){
            intarray[i] = scanner.nextInt();
        }
        for (int i = 0; i < intarray.length - 1; i++){
            for (int j = i + 1; j < intarray.length; j++){
                if (intarray[i] == intarray[j]){
                    System.out.println("Найдена пара равных чисел");
                    return;
                }
            }
        }
        System.out.println("Одинаковые числа не найдены");

    }
}
