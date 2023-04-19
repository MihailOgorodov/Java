package org.example.sem2;

public class Time_project {
    public static void main(String[] args) {
        String a = "";

        long begin = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            a += Character.getName(i); // обертка вокруг char, это класс с методами. Getname - возвращает имя char с индексом, который передаем
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
        System.nanoTime(); // в наносекундах
    }
}
