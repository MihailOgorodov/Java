package org.example.lec1;

public class methods {
    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1) return 1;
        return n * factor(n - 1);
    }

    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
}
/*
public class Program {
 public static void main(String[] args) {
 int a = 1;
 int b = 2;
 int c;
 if (a > b) {
 c = a;
 } else {
 c = b;
 }
 System.out.println(c);
 }
}
int a = 1;
 int b = 2;
 int c = 0;
 if (a > b) c = a;
 if (b > a) c = b;

int a = 1;
 int b = 2;
 int min = a < b ? a : b;
 System.out.println(min);

int mounth = value;
 String text = "";
 switch (mounth) {
 case 1:
 text = "Autumn";
 break;
...
 default:
 text = "mistake";
 break;

 */
