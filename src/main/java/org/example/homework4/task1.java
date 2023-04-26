package org.example.homework4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws Exception {
        File file = new File("MyText.txt");
        FileWriter fw = new FileWriter(file);
        fw.write("Валерий Иванович Медяков 32 М");
        fw.write("\nПетр Петрович Иванович 35 М");
        fw.close();
        FileReader fr = new FileReader(file);
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        fr.close();
    }
}



