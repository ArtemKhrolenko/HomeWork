package com.week_01;
import java.util.Scanner;

/*Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
        124    4    -   true
        1456   567  -   false
        1      2    -   false
        18     98   -   true*/

public class Solution_4_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 % 10 == number2 % 10);
    }

}
