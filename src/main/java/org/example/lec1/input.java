package org.example.lec1;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();

        String s = "qwerty";
        int a = 123;
        String q = a + s;
        System.out.println(q);

        int f = 1, g = 2;
        int h = f + g;
        String res = String.format("%d + %d = %d \n", f, g, h);
        System.out.printf("%d + %d = %d \n", f, g, h); // вывод можно с промощью printf - Тогда можно сразу же вставлять формулу
        System.out.println(res);

        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3,14
        System.out.printf("%.3f\n", pi); // 3,141
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00


    }


}