package com.week_02;

/**
 * Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Solution_04_01 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, -1, 3, 3, 8, 2, 3};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.printf("Max: %d, Min: %d", max, min);
    }
}
