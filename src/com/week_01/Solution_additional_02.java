package com.week_01;

import java.util.Arrays;
import java.util.Scanner;
/**
 2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 тельные заменить на 0.
 */
public class Solution_additional_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int[] intArray = new int[3];
        for (int i = 0; i < 3; i++){
            intArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++){
            if (intArray[i] > 0)
                intArray[i] = (int) Math.pow(intArray[i], 3);
            else if (intArray[i] < 0)
                intArray[i] = 0;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
