package org.example.sem5;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;

public class map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("пять", "Five");
        map.put("два", "Two");
        map.put("один", "One");
        map.put("четыре", "Four");
        System.out.println(map);

        String str = map.get("пят");// если такого ключа нет, вернет null
        System.out.println(str);
        String str1 = map.get("пять");
        System.out.println(str1);

        map.remove("один"); // удаление по ключу
        // Причем, вернет либо значение элемента, которое удалено, либо NULL, если нее нашел объект
        map.remove("пять", "Five"); // удаление по ключу
        // Если вводим ключ-значение - вернет истину, если нашел пару, и ложь, если не нашел и не удалил

        System.out.println(map);

        // Так как у Map нет индексов, сложно его итерировать
        map.keySet(); // возвращает список всех ключей

        // первый способ. Но здесь нельзя удалять элементы
        for (String key: map.keySet()) {
            System.out.println(map.get(key));
            
        }
        // второй способ итерирования. Можно удалить, изменить нельзя
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(map.get(key));
        }

        // третий способ. Можно изменить
        Set keys = map.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(map.get(keys.toArray()[i]));
        }
        map.replace("key", "5"); //замена, если ключ есть, то заменит на 5, если нет, то вернет null
        map.replace("Пять", "Five", "5"); // если нет - то ложь, если да - поменят и тру

        map.getOrDefault("шесть", "0"); // если ключ шесть не найден, то возвращает значение 0

        map.containsKey("шесть"); // существует ли такой ключ
        map.containsValue("5"); // значение
        map.putIfAbsent("шесть", "6"); // запишет значение, только если такого ключа не было, если было, вернет null
        map.forEach((k, v) -> System.out.println(k+" "+v)); // использует лямбда функции

        map.compute("шесть", (k, v) -> v+="!"); // изменяет значение переменной в паре ключ+значение, если нет ключа - null

        map.computeIfPresent("Шесть", (k, v) -> v+"!?"); // изменяет значение, если нет ключа - ничего не делает
        map.computeIfAbsent("Шесть", v -> v+"!?!"); // сработает только если такого ключа нет


        for (String key: map.keySet()) {          // замена всех значений в коллекции
//            map.compute(key, (k, v) -> v+"!");
            map.merge(key, "!", String::concat);
        }

        System.out.println(map);

        map.merge("Один", "7", String::concat); // к значению ключа прибавляем новое значение

        System.out.println(map);

        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>(); // отличается от HashMap тем, что всегда есть previous И next и он всегда помнит последовательность ввода данных
        hashMap.put("РџСЏС‚СЊ", "Five");
        hashMap.put("Р”РІР°", "Two");
        hashMap.put("РћРґРёРЅ", "One");
        hashMap.putIfAbsent("РЁРµСЃС‚СЊ", "6");
        System.out.println(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {  // хранит пары в виде дерева и сортирует по ключу
            @Override                                   // можем при создании указать компаратор и он будет сравнивать значения
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        treeMap.putIfAbsent(6, "6");
        System.out.println(treeMap.headMap(2, true)); // возвращает кусок словаря от начала до значения. Второе значение - включать значение или нет
        System.out.println(treeMap.tailMap(2, false)); // тоже самое, но после значения до конца

        int[] ints;
        ArrayList<Integer> integers;
        HashMap<Integer, Integer> map1;

    }

}
