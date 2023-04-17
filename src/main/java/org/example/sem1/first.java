package org.example.sem1;
import java.util.Random;
public class first {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
        String[] line = String.valueOf(i).split("");
        for (int j = line.length - 1; j >= 0; j--) {
            System.out.print(line[j]);
        }
        System.out.println();
        String name = "Иванов Иван Иванович";
        String[] arrayName = name.split(" ");
        System.out.println(arrayName[0] + ' ' + arrayName[1].toUpperCase().charAt(0) + ' ' + arrayName[2].toUpperCase().charAt(0));

    }
}