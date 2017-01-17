package com.week_02;

import java.util.Arrays;

/**
 * Вывести в консоль элементы той половины одномерного массива у которой среднее арифметическое максимальное
 */
public class Solution_04_07 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateMas(7, 54);
        System.out.println("Оригинальный массив: \n" + Arrays.toString(arr));
        int half = arr.length / 2;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < half; i++){
            sum1 += arr[i];
            sum2 += arr[i + half];
        }
        if (arr.length % 2 != 0)
            sum2 += arr[arr.length - 1];
        int start, end;
        if (sum1 > sum2){
            start = 0;
            end = half;
        }
        else {
            start = half;
            end = arr.length;
        }
        for (int i = start; i < end; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
