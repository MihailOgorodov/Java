package org.example.lec5;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {

        /*
        Map – это множество коллекций, работающих с данными
по принципу <Ключ / Значение>.
Ключевые особенности:
● ускоренная обработка данных;
● порядок добавления не запоминается.
В HashMap элементы располагаются как угодно и могут
менять свое положение.

         */
        Map<Integer, String> db = new HashMap<>(); // в map всегда есть ключи и значения как в питоновских словарях
        db.put(1, "один"); System.out.println(db);
        db.put(2, "два"); System.out.println(db);
        db.put(3, "три"); System.out.println(db);
        db.put(31, "три один"); System.out.println(db);
        db.put(13, "один три"); System.out.println(db);
        db.put(null, "!null"); System.out.println(db);
        db.put(null, null); System.out.println(db);
        /*
        put(K,V) – добавить пару если или изменить значение,если ключ имеется.
putIfAbsent(K,V) – произвести добавление если ключ не найден.
get(K) - получение значения по указанному ключу.
remove(K) – удаляет пару по указанному ключу.
containsValue(V) – проверка наличия значения.
containsKey(V) – проверка наличия ключа.
keySet() – возвращает множество ключей.
values() – возвращает набор значений.
         */
        Map<Integer, String> db1 = new HashMap<>();
        db1.putIfAbsent(1, "один");
        db1.put(2, "два");
        db1.put(3, "три");
        System.out.println(db1);
        for (var item : db1.entrySet()) { // foreach для пробегания по элементам
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        Map<Integer,String> map1 = new HashMap<>(); // выделение памяти под Map по умолчанию - 16 элементов. Если количество элементов заполнено на 75-80% - их количество удваивается
        Map<Integer,String> map2 = new HashMap<>(9); // начальное значение 9
        Map<Integer,String> map3 = new HashMap<>(9, 1.0f); // первое - количество элементов, второе - процентное заполнение, после которого будет увеличение элементов в 2 раза. Сейчас 100%



    }
}
