package com.week_01;

import java.util.Arrays;
import java.util.Scanner;

/**
 13) Даны три числа A,B,C. Увеличить числа в два
 раза, если A+B+C>0, в противном случае заменить
 на нули.
 */
public class Solution_additional_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[3];
        int sum = 0;
        System.out.println("Введите три числа:");

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }

        if (sum > 0)
            for (int i = 0; i < intArray.length; i++){
                intArray[i] *= 2;
            }
        else
            for (int i = 0; i < intArray.length; i++){
                intArray[i] = 0;
            }
        System.out.println(Arrays.toString(intArray));
    }
}
