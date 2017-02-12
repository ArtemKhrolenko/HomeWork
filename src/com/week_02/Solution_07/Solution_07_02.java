package com.week_02.Solution_07;

/**
 * Проверить или является число простым
 */
public class Solution_07_02 {
    public static boolean isSimpleNum(int num){
        if (num % 2 == 0) return false;
        else
            for (int i = 2; i < num - 1; i++){
                if (num % i == 0)
                    return false;
            }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isSimpleNum(9973)? "Simple": "Composed");
    }
}
