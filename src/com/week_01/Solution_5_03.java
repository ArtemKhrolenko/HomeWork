package com.week_01;

/*5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер*/

import java.util.Scanner;

public class Solution_5_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maches = 0;
        System.out.println("Введите число: ");
        String str = scanner.next();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '8')
                maches++;
        }
        System.out.printf("Символ 8 в введенном числе %s встречается %d раз.", str, maches);
    }
}
