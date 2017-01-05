package com.week_02;

import java.util.Arrays;

/**
 * Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Solution_04_01 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateMas(7, 54);
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.printf("Max: %d, Min: %d", max, min);
    }
}
