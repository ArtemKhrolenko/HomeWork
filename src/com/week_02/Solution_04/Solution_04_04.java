package com.week_02.Solution_04;

import com.week_02.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Посчитать сколько цифр(цифра задается пользователем) в массиве
 */
public class Solution_04_04 {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateMas(7, 10);
        System.out.println("Оригинальный массив: \n" + Arrays.toString(arr));
        System.out.println("Введите цифру");
        int digit = new Scanner(System.in).nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == digit)
                count++;
        }
        System.out.printf("Цифра %d встречается %d раз", digit, count);
    }
}
