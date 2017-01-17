package com.week_02;

import java.util.Arrays;

/**
 * Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов
 */
public class Solution_04_09 {
    public static void main(String[] args) {
        final int RANGE = 7;
        int[] arr1 = new int[RANGE];
        int[] arr2 = new int[RANGE];
        for (int i = 0; i < RANGE; i++){
            arr1[i] = (int) (Math.random() * 50 + 25);
            arr2[i] = (int) (Math.random() * 50 + 75);
        }
        System.out.println("Массив 1: " + Arrays.toString(arr1));
        System.out.println("Массив 2: " + Arrays.toString(arr2));

        int m = 0; //m > 0 - четные 1го массива; m < 0 - четные 2го массива
        for (int i = 0; i < RANGE; i++){
            if (arr1[i] % 2 == 0) m++;
            if (arr2[i] % 2 == 0) m--;
        }
        if (m == 0) System.out.println("Одинаковое количество четных элементов");
        else {
            String str = m > 0 ? "массиве №1" : "Массиве №2";
            System.out.println("Четных элементов больше в " + str);
        }
    }
}
