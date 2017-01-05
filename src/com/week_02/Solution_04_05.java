package com.week_02;

import java.util.Arrays;

/**
 * Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные
 */
public class Solution_04_05 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                arr[i] = (int) (Math.random() * 54);
                if (arr[i] % 2 != 0) arr[i] += 1;
            }
            else{
                arr[i] = (int) (Math.random() * 53);
                if (arr[i] % 2 == 0) arr[i] -= 1;
            }
        }
        System.out.println("Измененный массив: \n" + Arrays.toString(arr));
    }
}

