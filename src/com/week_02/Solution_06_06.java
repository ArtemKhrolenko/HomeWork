package com.week_02;

/**
 * Returns true if for every '*' (star) in the string,
 * if there are chars both immediately before and after the star, they are the same.
 */
public class Solution_06_06 {
    public static boolean sameStarChar(String str1){
        int i = 0;
        boolean result = true;
        while (true){
          int index = str1.indexOf('*', i);
          if (index < 0) break;
          i = index + 1;
          if (!(i > 1 && i < str1.length() && str1.charAt(i - 1 - 1) == str1.charAt(i))){
              result = false;
              break;
          }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yfe*"));

    }
}
