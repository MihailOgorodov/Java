package org.example.sem1;
import java.util.Random;
public class intro {
    public static void main(String[] args) {
        int i; // 32 бита целое от -2 млрд до +2 млрд
        long l; // 64 бита целое
        float f = 345.56f;   // 32 дробное
        double d = 345.56; // 64 дробное
        byte b; // 8 бит целое
        short sh; // 16 бит целое
        char ch; // 16 бит целое, беззнаковое. индекс символа в таблице символов. То есть есле в char = 'e', то это будет индекс буквы е в таблице букв.
        // '' - индексы, "" - текст
        String s = "=) "; // текст
        System.out.println(s.repeat(12));

        // Для сравнения двух строк между собой
        if (s.contains("=")) print("ДА");
        else print("НЕТ");
        if (s.equals("=")) print("ДА");
        else print("НЕТ");

        print(s.replace('=', '+').repeat(10));
//        s.substring(3, s.length()-2); // вернет строку начиная с 3 символа до -2 с конца
        String[] lines = s.split(""); // раздел по заданному признаку и возвращает массив строк

        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.toBinaryString(17)); // двоичный код
        System.out.println(Integer.parseInt("12456"));

        Random random = new Random();
        System.out.println(random.nextInt(12)); // случайное число от -12 до +12
        System.out.println(random.nextInt(12,1146)); // случайное число от 12 до +1146
    }
    //int[] ints = new int[10]; // или int[] ints = new int[]{1,2,3,4,5};
    // i = ints.length;
    // Увеличиваем массив на количество заданных элементов
    // Создаем новый массив и присваиваем ему длину текущего массива+количество новых элементов
//        int[] temp = new int[ints.length + 1];
//        for (int j = 0; j < ints.length; j++) {
//            temp[j] = ints[i];
//        }
//        ints = temp;
    // условия
//        if(2!=3)
//
//    {
//        print("Hi");
//    }

//    print("=) ".repeat(5)); // " " - это полноыенный метод String и можем делать с ним все тоже самое


    private static void print(String s) {
        System.out.println(s);
    }
}

}
