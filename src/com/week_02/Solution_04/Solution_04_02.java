package com.week_02.Solution_04;

import com.week_02.ArrayUtils;

import java.util.Arrays;

/**
 Поменять местами наибольший и наименьший элементы в массиве
 */
public class Solution_04_02 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateMas(7, 54);
        int max = arr[0];
        int min = arr[0];
        int maxi = 0, mini = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxi = i;
            }

            if (arr[i] < min) {
                min = arr[i];
                mini = i;
            }
        }
        //Замена двух элементов массива, не используя дополнительной переменной - через XOR
        System.out.println("Оригинальный массив: \n" + Arrays.toString(arr));
        arr[maxi] = arr[maxi] ^ arr[mini];
        arr[mini] = arr[maxi] ^ arr[mini];
        arr[maxi] = arr[maxi] ^ arr[mini];
        System.out.println("Измененный массив: \n" + Arrays.toString(arr));

    }
}
