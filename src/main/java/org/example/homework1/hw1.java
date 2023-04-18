package org.example.homework1;

import java.util.Random;

public class hw1 {
    public static void main(String[] args) {
//      1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = new Random().nextInt(0, 2001);
        System.out.printf("1. Случайное целое число = %d \n", i);
//      2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.toBinaryString(i).length();
        System.out.printf("2. Номер старшего значащего бита числа %d = %d \n", i, n);
//      3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1.
        int count = 0;
        for (int j = 0; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                count++;
            }
        }
        int[] m1 = new int[count];
        count = 0;
        for (int j = 0; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[count] = j;
                count++;
            }
        }
//        System.out.printf("3. Массив чисел кратных %d = %s \n", n, Arrays.toString(m1));
        System.out.printf("3. Массив m1 состоит из %d элементов \n", count);
//      4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        count = 0;
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                count++;
            }
        }
        int[] m2 = new int[count];
        count = 0;
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                m2[count] = j;
                count++;
            }
        }
//        System.out.printf("4. Массив чисел некратных %d = %s \n", n, Arrays.toString(m2));
        System.out.printf("4. Массив m2 состоит из %d элементов \n", count);


    }

}

