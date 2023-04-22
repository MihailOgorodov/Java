package org.example.homework3;

import java.util.*;

public class task1 {
    public static void main(String[] args) {
        //Реализовать алгоритм обратной сортировки списков компаратором.
        ArrayList<Integer> firstList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            firstList.add(new Random().nextInt(50));
        }
        System.out.println("Список firstList " + firstList);
        firstList.sort(Comparator.reverseOrder());
        System.out.println("Обратная сортировка списка firstList " + firstList);

        //Пусть дан произвольный список целых чисел, удалить из него чётные числа
        ArrayList<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            secondList.add(new Random().nextInt(50));
        }
        System.out.println("Список secondList " + secondList);
        secondList.removeIf(i -> i % 2 == 0);
        System.out.println("Список secondList без четных числе " + secondList);

        //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        ArrayList<Integer> thirdList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            thirdList.add(new Random().nextInt(50));
        }
        System.out.println("Список thirdList " + thirdList);
        thirdList.sort(Comparator.naturalOrder());
        int minNum = thirdList.get(0);
        int maxNum = thirdList.get(thirdList.size() - 1);
        System.out.println("минимальное значение " + minNum);
        System.out.println("максимальное значение " + maxNum);
        double sum = 0;
        for (int x : thirdList) {
            sum += x;
        }
        System.out.print("среднее значение " + sum / thirdList.size());

        //Дано два целочисленных списка, объединить их не допуская элементы второго списка уже встречающиеся в первом.
        System.out.println("\n" + firstList);
        System.out.println(thirdList);
        firstList.removeAll(thirdList);
        System.out.println(firstList);

        //Создать ArrayList<Integer> и добавить нулевым элементом ноль 10000 раз.
        ArrayList<Integer> fourthList = new ArrayList<>();
        double begin = System.currentTimeMillis();
        for (int i = 0; i < 10001; i++) {
            fourthList.add(0, 0);
        }
        double end = System.currentTimeMillis();
        //System.out.println(fourthList);

        //Повторить пятый пункт, но с LinkedList.
        LinkedList<Integer> fifthList = new LinkedList<>();
        double begin1 = System.currentTimeMillis();
        for (int i = 0; i < 10001; i++) {
            fifthList.add(0, 0);
        }
        double end1 = System.currentTimeMillis();
        //System.out.println(fifthList);

        //Сравнить время работы пятого и шестого пунктов.
        System.out.println("время работы ArrayList: " + (end - begin));
        System.out.println("время работы LinkedList: " + (end1 - begin1));
    }
}

