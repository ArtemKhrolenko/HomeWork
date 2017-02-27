package com.week_03;

import java.util.ArrayList;
import java.util.Formatter;

/**
 * 3.6. требуется найти самую длинную неприрывную цепочку нулей и единиц в последовательности цифр.
 * Вход: 10001101001
 * Выход:
 * (2,4) - цепочка нулей;
 * (5,6) - цепочка единиц
 */
public class Solution_03_6 {
    private static String ranges(ArrayList<Integer> inArrayList, int last){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(inArrayList);

        if (last > arrayList.get(arrayList.size() - 1))
            arrayList.add(last + 1);

        int start = 0;
        int end = 0;
        int maxRazn = 0;
        int tmpRazn;
        for (int i = 0; i < arrayList.size() - 1; i++){
            tmpRazn = arrayList.get(i + 1) - arrayList.get(i);
            if (tmpRazn > maxRazn){
                maxRazn = tmpRazn;
                start = arrayList.get(i) + 1;
                end = arrayList.get(i + 1) - 1;
            }
        }
        return new Formatter().format("(%d, %d)", start + 1, end + 1).toString();
    }

    public static void getRange(String sequence){
        byte[] byteArray = sequence.getBytes();
        ArrayList<Integer> nullIndex = new ArrayList<>();
        ArrayList<Integer> oneIndex = new ArrayList<>();

        for (int i = 0; i < byteArray.length; i++){
           if (byteArray[i] == '0')
               nullIndex.add(i);
           else
               oneIndex.add(i);
        }
        System.out.println("Sequence: " + sequence);
        System.out.println("Sequence of \"0\": " + ranges(oneIndex, nullIndex.get(nullIndex.size() - 1)));
        System.out.println("Sequence of \"1\": " + ranges(nullIndex, oneIndex.get(oneIndex.size() - 1)));

    }
    public static void main(String[] args) {
        getRange("100110111100000");

    }
}
