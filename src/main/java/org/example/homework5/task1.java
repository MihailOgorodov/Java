package org.example.homework5;

import java.util.HashMap;
import java.util.Map;

/*
Создать множество, ключ и значение строки. Добавить шесть элементов. Вывести в консоль значения. Добавить ко всем значениям символ "!".
Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключами первого.
Объединить значения во втором множестве и первом, если ключи совпадают. Вывести результат в консоль.
 */
public class task1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Первый", "Арбуз");
        hm.put("Второй", "Абрикос");
        hm.put("Третий", "Слива");
        hm.put("Четвертый", "Яблоко");
        hm.put("Пятый", "Банан");
        hm.put("Шестой", "Виноград");
        System.out.println(hm);

        for (String key : hm.keySet()) {
            hm.compute(key, (k, v) -> v + "!");
        }

        System.out.println(hm);
        System.out.println("-".repeat(130));

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("Первый", "Арбуз");
        hm1.put("Two", "Абрикос");
        hm1.put("Третий", "Слива");
        hm1.put("Four", "Яблоко");
        hm1.put("Five", "Банан");
        hm1.put("Шестой", "Виноград");

        for (String key : hm1.keySet()) {
            hm1.compute(key, (k, v) -> v + "!");
        }
        System.out.println(hm1);

        for (String key : hm.keySet()) {
            hm1.computeIfAbsent(key, v -> v + v);
        }
        System.out.println(hm1);
    }
}