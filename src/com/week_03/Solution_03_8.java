package com.week_03;

import java.util.Scanner;

/**
 * Напишите программу, которая позволяет пользователю ввести в консоли строку,
 переводит первый символ слов в верхний регистр и результат выводит в консоль
 */
public class Solution_03_8 {
    public static String upperCase(String str){
        String[] arrayString = str.split(" ");
        String result = "";
        for (String elem: arrayString){
            //result += str.substring(0,1).toUpperCase()+ " ";
            result += elem.substring(0,1).toUpperCase() + elem.substring(1) + " ";
        }

        return result.trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(upperCase(scanner.nextLine()));
    }
}
