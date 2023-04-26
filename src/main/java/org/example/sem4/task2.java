package org.example.sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listf = new ArrayList<>();
        ArrayList<String> listn = new ArrayList<>();
        ArrayList<String> listsn = new ArrayList<>();
        ArrayList<Integer> listage = new ArrayList<>();
        ArrayList<String> listgen = new ArrayList<>();
        ArrayList<Integer> listid = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        int id = 0;
        while (!in.equals("q")) {
            System.out.println(in);
            String[] st = new String[5];
            st = in.split(" ");
            list.add(in);
            listf.add(st[0]);
            listn.add(st[1]);
            listsn.add(st[2]);
            listage.add(Integer.parseInt(st[3]));
            listgen.add(st[4]);
            listid.add(id);
            in = scanner.nextLine();
            id++;
        }
        System.out.println();

        // сортировка пузырьком по возрасту
        int temp = 0;
        boolean flag = true;
        while (flag) {
            for (int g = 0; g < listage.size() - 1; g++) {
                flag = false;
                if (listage.get(g) >= listage.get(g + 1)) {
                    temp = listage.get(g);
                    listage.set(g, listage.get(g + 1));
                    listage.set(g + 1, temp);

                    temp = listid.get(g);
                    listid.set(g, listid.get(g + 1));
                    listid.set(g + 1, temp);
                    flag = true;

                }
            }
        }
        for (int i : listid) {
            System.out.println(list.get(i));

        }
//        System.out.println(listid);
//        System.out.println(listf);
//        System.out.println(listn);
//        System.out.println(listsn);
//        System.out.println(listage);
//        System.out.println(listgen);


    }

//    private static void sortIndexesByIntList(ArrayList<Integer> arrayToSort, LinkedList<Integer> ind) {
//        ArrayList<Integer> arr = new ArrayList<>(arrayToSort);
//
//        for (int i = 0; i < arr.size(); i++) {
//            for (int j = 0; j < arr.size() - 1; j++) {
//                if (arr.get(j) > arr.get(j + 1)) {
//                    int tmp = ind.get(j);
//                    ind.set(j, ind.get(j + 1));
//                    ind.set(j + 1, tmp);
//
//                    tmp = arr.get(j);
//                    arr.set(j, arr.get(j + 1));
//                    arr.set(j + 1, tmp);
//                }
//            }
//        }
//    }
}
