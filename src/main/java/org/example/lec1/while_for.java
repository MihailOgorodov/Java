package org.example.lec1;

public class while_for {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;
        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
/*
        int value = 321;
        int count = 0;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

        int s = 0;
 for (int i = 1; i <= 10; i++) {
 s += i;
 }
 System.out.println(s);

 */
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        /* СОздание и запись
import java.io.FileWriter;
import java.io.IOException;
public class Program {
 public static void main(String[] args) {
 try (FileWriter fw = new FileWriter("file.txt", false)) {
 fw.write("line 1");
 fw.append('\n');
 fw.append('2');
 fw.append('\n');
 fw.write("line 3");
 fw.flush();
 } catch (IOException ex) {
 System.out.println(ex.getMessage());
 }
 } }

 чтение
 import java.io.*;
public class Program {
 public static void main(String[] args) throws Exception {
 FileReader fr = new FileReader("file.txt");
 int c;
 while ((c = fr.read()) != -1) {
 char ch = (char) c;
 if (ch == '\n') {
 System.out.print(ch);
 } else {
 System.out.print(ch);
 }
 }
 } }

 построчно
 import java.io.*;
public class Program {
 public static void main(String[] args) throws Exception {
 BufferedReader br = new BufferedReader(new FileReader("file.txt"));
 String str;
 while ((str = br.readLine()) != null) {
 System.out.printf("== %s ==\n", str);
 }
 br.close();
 }
}
         */
    }

}
