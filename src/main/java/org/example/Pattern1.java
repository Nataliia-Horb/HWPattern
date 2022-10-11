package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pattern1 {

    /**
     * таск 1 - у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
     */
    public static List<Integer> twiceInt(List<Integer> arr) {
        List<Integer> arr1=new ArrayList<>();
        for (int a: arr) {
            arr1.add(a*2);
        }
        return arr1;
    }


    /**
     * таск 2 - у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String
     */
    public static List <Integer> lengthString(List<String> arr) {
        List<Integer> arr1=new ArrayList<>();
        for (String a: arr) {
            arr1.add(a.length());
        }
        return arr1;
    }
}
