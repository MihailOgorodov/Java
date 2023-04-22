package org.example.sem3;

import java.lang.reflect.Array;
import java.util.*;

public class task1 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // тип объекта, название объекта, слово new для выделения памяти и конструктор
        // ArrayList хранит ссылки на другие объекты, внутри лежит просто массив со ссылками. Поэтому можно в лист добавить
        // разные типы данных

        list.add(1); // добавить в конец списка
        list.add(1.1);
        list.add(1.1f);
        list.add("one");
        list.add(true);
        System.out.println(list);
// ДИНАМИЧЕСКОЕ ПРИВЕДЕНИЕ К ВИДУ
        // взять элемент из списка - медленный способ
//        if(list.get(0) instanceof Integer){  // если 0 элемент списка list является наследником object типа Integer - берем его
//           int a = ((Integer)list.get(0)); // преобразует этот элемент в Integer и присваиваем его переменной а
//
//        }
        ArrayList<String> list1 = new ArrayList<>(); // <> - обобщение. Ускоряет производительность, потому что мы указываем тип данных, который хранится в list

        //list.add(1); // Java не принимает другие типы данных, кроме String
        //list.add(1.1);
        //list.add(1.1f);
        list1.add("one");
        list1.add("two");
        list1.add(1, "hi"); // таким образом добавляем элемент на указанный индекс, а все остальные элементы в листе подвинутся
        //list.add(true);
        list1.size(); // покажет, сколько элементов сохранено в list.

        System.out.println(list1);
        list1.remove(1); // удаление элемента с позиции, все остальные элементы в листе подвинутся
        System.out.println(list1);
        String q = list1.get(0); // присвоим элемент
        System.out.println(q);

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(new Random().nextInt(25)); // Заполнение листа рандомные числами
        }
        System.out.println(list2);
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list5.add(new Random().nextInt(25)); // Заполнение листа рандомные числами
        }

        // в пустом массиве в JAVA всегда инициализировано 10 элементов

//        for (int i = 0; i < list2.size(); i++) { // перебор элемента в списке
//            System.out.println(list2.get(i));
//
//        }
//        for (int n : list2) {  // короткий цикл foreach, в ней нельзя удалить данные и внести изменения в список
//            System.out.println(n);
//        }

//        list2.forEach(n -> System.out.println(n)); // перебирает все элементы списка, каждому назначает n и выводит на экран
//
//        Iterator<Integer> iterator = list2.iterator();  // класс, который создает массив из элементов переданных ему данных
//        while (iterator.hasNext()) {  // hasNext перебирает все элементы и возвращает истину, пока они есть
//            int h = iterator.next();  // возвращает очередной элемент итератора и уменьшает оставшиеся на 1
//            System.out.println(h);
//            iterator.remove();
//        }
//        ListIterator<Integer> iterator2 = list2.listIterator(list2.size() - 1);  // Тоже самое, но может начинать с любого места списка
//        while (iterator2.hasPrevious()) {
//            int i = iterator2.previous();
//            System.out.println(i);
//            iterator2.remove();
//        }
//        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(list2); // добавить все элементы из одного в другой
        System.out.println("list3 = " + list3);
        System.out.println("-".repeat(60));
        System.out.println(list5);
        System.out.println(list2);
        System.out.println("-".repeat(60));
        //list2.removeAll(list5); // удалить из лист2 все элементы лист5

        list2.retainAll(list5); // оставляет в лист2 только те элементы, которые есть в лист5
        System.out.println(list2);

        final int r = 10; // можно финализировать все объекты в JAVA, тогда их нельзя будет переназначить
        // r = 9; - так нельзя будет сделать

        if (list2.contains(40)) { // если такой элемент есть в списке, то вернет истину, работает для всех типов объектов
            System.out.println(true);
        }
        List<Integer> list8 = list2.subList(0, 2); // в списке лист8 лежит с 0 по 2 элемент из списка лист2
        List<Integer> list9 = (List<Integer>) list2.clone(); // возвращает ссылку на объект - точную копию лист2
        System.out.println(list9);
        list2.clear(); // очищает список, заменяя все данные в stack массива на null. Размер списка size = 0, а все объекты в HEAP остаются для мусорщика


        // СОРТИРОВКА. Список умеет себя сортировать
        list9.sort(Comparator.naturalOrder()); // сортирует все в порядке по увеличению (цифры, буквы)
        System.out.println("list9.sort" + list9);
        list9.sort(Comparator.reverseOrder()); // сортирует все в порядке по уменьшению (цифры, буквы)
        System.out.println("list9.sort" + list9);
        System.out.println(list9);
        list9.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1; // сортировка по убыванию
            }
        });
        System.out.println(list9);
        list9.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) { //  с условием
                if (o2 % o1 != 0) return 0;
                if (o1 < o2) return -1;
                return 1;
            }
        });
        System.out.println(list9);

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(3);
        System.out.println(integers);
        int v = integers.get(7);


    }
}
