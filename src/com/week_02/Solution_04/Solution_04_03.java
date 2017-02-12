package com.week_02.Solution_04;

import com.week_02.ArrayUtils;

import java.util.Arrays;

/**
 * Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class Solution_04_03 {
    public static void main(String[] args) {
        int[] array_one = ArrayUtils.generateMas(7, 54);
        int[] array_two = ArrayUtils.generateMas(7, 54);
        /*for (int i = 0; i < array_one.length; i++){
            array_two[i] = array_one[i];
        }*/

        //Либо - копирование одной строкой
        array_two = Arrays.copyOf(array_one, array_one.length);

        System.out.println("Оригинальный массив: \n" + Arrays.toString(array_one));
        System.out.println("Измененный массив: \n"   + Arrays.toString(array_two));
    }
}
