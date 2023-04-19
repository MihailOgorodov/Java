package org.example.homework2;

public class task2 {
    public static void main(String[] args) {
        String my_string = """
                Как на горке - снег, снег,
                И под горкой - снег, снег,
                И на елке - снег, снег,
                И под елкой - снег, снег.
                А под снегом спит медведь.
                Тише, тише. Не шуметь!""";

        double begin = System.nanoTime();
        double begin1 = System.currentTimeMillis();

        String search = "снег";
        System.out.println(my_string);

        System.out.println("\n" + my_string.replace(search, "лёд"));
        double end = System.nanoTime();
        double end1 = System.currentTimeMillis();

        System.out.println("\n Время работы в наносекундах: " + (end - begin));
        System.out.println("Время работы в милисекундах: " + (end1 - begin1));

        begin = System.nanoTime();
        begin1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.indexOf(search) > 0) {
            sb.replace(sb.indexOf(search), sb.indexOf(search) + search.length(), "лёд");
        }
        System.out.println("\n" + sb);

        end = System.nanoTime();
        end1 = System.currentTimeMillis();
        System.out.println("\n Время работы в наносекундах: " + (end - begin));
        System.out.println(" Время работы в милисекундах: " + (end1 - begin1));
    }
}