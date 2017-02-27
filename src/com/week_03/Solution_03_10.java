package com.week_03;
import java.util.LinkedHashSet;

/**
 * Удалить из предложения слова которые повторяются
 */
public class Solution_03_10 {
    public static String removeWords(String str){
        String[] wordsArray = str.split(" ");
        LinkedHashSet<String> words = new LinkedHashSet<>();
        for (String elem: wordsArray){
            words.add(elem);
        }

        StringBuilder result = new StringBuilder("");
        for (String elem: words){
            result.append(elem).append(" ");
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(removeWords("Mama mila mila Mama gfg ramu Mama mila ramu"));
    }
}