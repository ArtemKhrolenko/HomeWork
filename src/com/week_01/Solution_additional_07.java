package com.week_01;

import java.util.Scanner;

/**
 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
 времени года. Если пользователь введет недопустимое число, программа
 должна выдать сообщение об ошибке.
 */
public class Solution_additional_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season;
        int month = scanner.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Недопустимый номер месяца");
            return;
        } else
            if (month == 12 || month == 1 || month == 2)
                season = "Winter";
            else
                if (month > 2 && month < 6)
                    season = "Spring";
                else

                    if (month > 5 && month < 9)
                        season = "Summer";
                    else
                     season = "Outumn";
        System.out.println(season);

    }
}
