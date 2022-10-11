package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main  {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(18);
        arr.add(34);
        arr.add(15);
        arr.add(4);
        arr.add(22);
        arr.add(54);
        arr.add(1);
        arr.add(10);
        arr.add(6);
        System.out.println(arr);
        System.out.println(Pattern1.twiceInt(arr));
        System.out.println(Pattern2.findMax(arr));
        System.out.println();

        List<String> arrStr = new ArrayList<>();
        arrStr.add("Dmitry Smirnov");
        arrStr.add("Vasilissa");
        arrStr.add("Ina Karel");
        arrStr.add("Vlad Sam");
        System.out.println(arrStr);
        System.out.println(Pattern1.lengthString(arrStr));
        System.out.println(Pattern2.totalLength(arrStr));

    }
}