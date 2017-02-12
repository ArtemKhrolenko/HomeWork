package com.week_02.Solution_05;

import java.util.Scanner;

/**
 * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!"
 */
public class Solution_05_02_01 {
    public static String helloName(){
        Scanner scanner = new Scanner(System.in);
        return "Hello, " + scanner.nextLine() + "!";
    }
    public static void main(String[] args) {
        System.out.println(helloName());
    }
}
