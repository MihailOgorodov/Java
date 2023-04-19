/*
Поиск и замена слов по тексту.
Через String
Через StringBuilder
 */
package org.example.sem2;

/*
Самолет построим сами,
Понесемся над лесами,
Понесемся над лесами,
А потом вернемся к маме.
 */
public class task2 {
    public static void main(String[] args) {
        String my_string = """
                Самолет построим сами,
                Понесемся над лесами,
                Понесемся над лесами,
                А потом вернемся к маме.""";

        double begin = System.nanoTime();
        String search = "лесами";
        System.out.println(my_string);
        System.out.println();
        System.out.println(my_string.replace(search, "раз"));
        double end = System.nanoTime();
        System.out.println("Время работы: "+ (end - begin));
        System.out.println();
        begin = System.nanoTime();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.indexOf(search) > 0){
            sb.replace(sb.indexOf(search), sb.indexOf(search)+search.length(), "раз");
        }
        System.out.println(sb);
        end = System.nanoTime();
        System.out.println("Время работы: "+ (end - begin));
    }
}
