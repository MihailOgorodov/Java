/*
Написать метод принимающий строку, ищущий в ней основание и степень После этого рассчитывающий результат и выводящий
в консоль в консоль строку параметра + ответ. Пример строки: "Основание -12б степень 7, результат".
Попробовать с разными входящими строками.
Сравнить скорость работы реплейса классов String и StringBuilder.
 */


package org.example.homework2;

public class task1 {
    public static void main(String[] args) {
        String str = "Основание -12б степень 7, результат";
        System.out.println(FindVars(str));
    }

    public static String FindVars(String my_string) {
        String[] line = my_string.split("");
        int base = 0;
        int power = 0;
        double result = 0;
        for (int i = 0; i < line.length; i++) {
            line[i] = line[i].replace(",", "");
            try {
                Integer.parseInt(line[i]);
                if (base == 0) {
                    base = Integer.parseInt(line[i]);
                } else {
                    power = Integer.parseInt(line[i]);
                }
            } catch (NumberFormatException e) {
                continue;
            }

        }
        result = Math.pow(base, power);
        return my_string + " " + String.valueOf(result);
    }
}
