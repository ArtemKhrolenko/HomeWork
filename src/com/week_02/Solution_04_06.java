package com.week_02;

import java.util.Arrays;

/**
 * Найти среднее арифметическое массива
 */
public class Solution_04_06 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateMas(7,54);
        System.out.println("Оригинальный массив: \n" + Arrays.toString(arr));
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        sum /= arr.length;
        System.out.printf("Среднее: %.3f", sum);
    }
}
