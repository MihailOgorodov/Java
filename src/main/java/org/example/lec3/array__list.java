package org.example.lec3;

import java.util.ArrayList;

/*
List – пронумерованный набор элементов.
Пользователь этого интерфейса имеет точный контроль над тем,
где в списке вставляется каждый элемент.
Пользователь может обращаться к элементам по их целочисленному
индексу (позиции в списке) и искать элементы в списке.
 */
public class array__list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // <Intager> - обобщение
        //ArrayList list = new ArrayList();
        list.add(2809);


        for (Object o : list) {
            System.out.println(o);
            /*
            ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        System.out.println(list3);
        list3.add(123);
        System.out.println(list4);

        add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
get(pos) – возвращает элемент из списка по указанной позиции
indexOf(item) – первое вхождение или -1
lastIndexOf(item) – последнее вхождение или -1
remove(pos) – удаление элемента на указанной позиции и его возвращение
set(int pos, T item) – gjvtoftn значение item элементу, который находится
на позиции pos
void sort(Comparator) – сортирует набор данных по правилу
subList(int start, int end) – получение набора данных от позиции start до end
             */
        }
    }
}
