// медленный способ
package org.example.sem4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); // ввод данных
        String in = scanner.nextLine();
        while (!in.equals("q")) {
            System.out.println(in);
            list.add(in);
            in = scanner.nextLine();
        }


        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int o11 = Integer.parseInt(o1.split(" ")[3]);
                int o22 = Integer.parseInt(o2.split(" ")[3]);
                return o11 - o22;
            }
        });
        System.out.println(list);

    }
}
