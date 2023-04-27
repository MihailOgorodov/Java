package org.example.lec5;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tMap = new TreeMap<>(); // упорядочивание пол ключу
        tMap.put(1,"один"); System.out.println(tMap);
        // {1=один}
        tMap.put(6,"шесть"); System.out.println(tMap);
        // {1=один, 6=шесть}
        tMap.put(4,"четыре"); System.out.println(tMap);
        // {1=один, 4=четыре, 6=шесть}
        tMap.put(3,"три"); System.out.println(tMap);
        // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2,"два"); System.out.println(tMap);
        // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
        tMap.put(7,"пять"); System.out.println(tMap);
        tMap.put(5,"восемь"); System.out.println(tMap);
        tMap.put(8,"семь"); System.out.println(tMap);

        /*
        put(K,V) get(K) remove(K) descendingMap() tailMap() headMap() lastEntry() firstEntry() descendingKeySet(V)
         */
    }
}
