package org.example.lec1;

import java.util.Arrays;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        System.out.println("hello_world123");
        var a = 5;
        var b = 123.42;
        var c = "super";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(getType(a));
        System.out.println(getType(b));
        System.out.println(getType(c));
        String s = "asdscbc";
        System.out.println(s.length()); // Длина строки
        s.charAt(2); // символ строки
        System.out.println(s.charAt(2));
//        System.out.println(a++); // постфиксный инкремент - сперав принт, потом ++
//        System.out.println(++a); // префиксный инкремент - сперва ++, потом принт
//        a = --a + ++a; //9
//        a = a-- + ++a; //10
        System.out.println(a);
        boolean y = 123 > 234;
        System.out.println(y);
        int[] arr = new int[10];
        System.out.println(arr.length);
        int[] brr = new int[]{2, 4, 5, 6, 7, 3, 3};
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
        System.out.println(Arrays.toString(brr));

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}