package com.week_02.Solution_03;

import java.util.Scanner;

/**

 Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
 */
public class Solution_03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the first array length: "); //first array input
        int arrayLength_01 = scanner.nextInt();
        int[] intArray_01 = new int[arrayLength_01];
        System.out.println("Type the first int array: ");
        for (int i = 0; i < arrayLength_01; i++){
            intArray_01[i] = scanner.nextInt();
        }
        System.out.print("Type the second array length: "); // second array input
        int arrayLength_02 = scanner.nextInt();
        int[] intArray_02 = new int[arrayLength_02];
        System.out.println("Type the first int array: ");
        for (int i = 0; i < arrayLength_02; i++){
            intArray_02[i] = scanner.nextInt();
        }

        System.out.println(intArray_01[0] == intArray_02[0] || intArray_01[arrayLength_01] == intArray_02[arrayLength_02]);
    }
}
