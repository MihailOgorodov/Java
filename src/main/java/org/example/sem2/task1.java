//Основание -5, стапень 3, результат равен
//Основание 127, стапень 2, результат равен
//Основание 33, стапень 15, результат равен
//Основание 4, стапень 7, результат равен
package org.example.sem2;


public class task1 {
    public static void main(String[] args) {
        System.out.println(parse_string("Основание -5, степень 3, результат равен"));
        System.out.println(parse_string("Основание 127, степень 2, результат равен"));
        System.out.println(parse_string("Основание 33, степень 15, результат равен"));
        System.out.println(parse_string("Основание 4, степень 7, результат равен"));
    }

    public static String parse_string(String in_string) {
        String[] line = in_string.split(" ");
        int base = 0;
        int power = 0;
        double product = 0;
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
        product = Math.pow(base, power);
        return in_string + " " + String.valueOf(product);

    }

}



