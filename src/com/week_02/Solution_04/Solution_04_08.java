package com.week_02.Solution_04;

import com.week_02.ArrayUtils;

import java.util.Arrays;

/**
 * Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
 который получается в результате суммы arr1[i] + arr2[i]
 */
public class Solution_04_08 {
    public static void main(String[] args) {
        final int RANGE = 7;
        int[] arr1 = ArrayUtils.generateMas(RANGE,54);
        int[] arr2 = ArrayUtils.generateMas(RANGE,54);
        System.out.println("Массив 1: " + Arrays.toString(arr1));
        System.out.println("Массив 2: " + Arrays.toString(arr2));

        int[] arr3 = new int[7];
        for (int i = 0; i < RANGE; i++){
            arr3[i] = arr1[i] + arr2[i];
        }
        System.out.println("Итоговый массив: " + Arrays.toString(arr3));
    }
}
