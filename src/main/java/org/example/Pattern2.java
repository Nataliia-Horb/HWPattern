package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pattern2 {
    /**
     *  таск 1 - у вас есть список значений int и вы должны вернуть их максимум или минимум
     */
    public static int findMax(List<Integer> arr) {
       int max= arr.get(0);

        for (Integer a: arr) {
            if (a>max) {
                max=a;
            }
        }
        return max;
    }
    /**
     *  таск 2 - у вас есть список String и вы должны вернуть общую длину строк
     */
    public static int totalLength(List<String> arr) {
        int length=0;
        for (String a: arr) {
            length+=a.length();
        }
        return length;
    }
}
