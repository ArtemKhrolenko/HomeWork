package com.week_03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 Строки. Ввод пароля.
 Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
 - длинна пароля должна быть от 8 до 20 символов
 - в пароле должны быть как маленькие так и большие буквы
 - должны быть цифры
 - не должен содержать слов 'password', 'pass', 'gfhjkm'
 - генерировать случайный пароль используя символы: a-z A-Z 0-9
 */
public class Solution_03_12 {
    private static Scanner scanner = new Scanner(System.in);

    private static String enterPass(){
        String passOne = "";
        String passTwo = "";
        while (true) {
            System.out.print("Enter the password:");
            passOne = scanner.nextLine();
            System.out.print("Enter the password one more time: ");
            passTwo = scanner.nextLine();
            if (passOne.equals(passTwo))
                break;
            else
                System.out.println("Passwords are not match!");
        }
        return passOne;
    }

    private static String generateRandomPass(){
        int randomMode;
        byte[] symbols = new byte[8];
        for (int i = 0; i < 8; i++){
            randomMode = (int)(1 + Math.random() * 3);
            switch (randomMode){
                case 1: symbols[i] = (byte) ((90 - 65 + 1) * (Math.random()) + 65); //A-Z (ASCII 65 - 90)
                        break;
                case 2: symbols[i] = (byte) ((122 - 97 + 1) * (Math.random()) + 97); // a-z (ASCII 97 - 122)
                        break;
                case 3: symbols[i] = (byte) ((57 - 48 + 1) * (Math.random()) + 48); //0-9 (ASCII 48 - 57)
                        break;
            }
        }
        return new String(symbols);
    }

    public static void main(String[] args) {

        String password;
        String variant;
        Matcher matcher;

        while (true){
            System.out.print("Do you want to generate random password? y/n: ");
            variant = scanner.nextLine();
            if (variant.equals("y")){
                password = generateRandomPass();
                break;
            }
            else
                password = enterPass();

            //Checking password by length
            if (password.length() < 8 || password.length() > 20){
                System.out.println("Password's length must be 8-20 chars!");
                continue;
            }

            //checking password by (A-Za-z)
            matcher = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])").matcher(password);
            if (!matcher.find()){
                System.out.println("Password must contain large and small laters");
                continue;
            }

            //Checking by digits
            matcher = Pattern.compile("\\d+").matcher(password);
            if (!matcher.find()){
                System.out.println("Password must contain digits");
                continue;
            }

            //Checking by "password" word
            if (password.contains("password") || password.contains("pass") || password.contains("gfhjkm")){
                System.out.println("Password should not contain words like \"password, etc\"");
                continue;
            }
            break;
        }

        System.out.println("Your password is: " + password);
    }
}
