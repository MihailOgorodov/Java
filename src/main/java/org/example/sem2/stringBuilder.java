package org.example.sem2;
import java.lang.*;

public class stringBuilder {

    public static void main(String[] args) {
        String a = "";
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            a += Character.getName(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);

        StringBuilder builder = new StringBuilder("Hello World");
        begin = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            builder.append(Character.getName(i));
        }
        end = System.currentTimeMillis();
        System.out.println(end - begin);
        builder.delete(0, builder.length()/2);// удалить кусочек строки
        builder.insert(2, 43);// вставит в строку со 2 символа
        builder.deleteCharAt(3);// удалить символ
        builder.reverse(); // Разворот строки
        builder.indexOf("Hel"); // индекс с которого начинается искомая строка
        builder.lastIndexOf("l");
        builder.replace(1,5,"234");// найти и заменить 234 в выбранном диапазоне
        builder.capacity(); // емкость



    }

    private void append(String name) {
    }
}
