package org.example.lec1;

public class array {
    public static void main(String[] args) {
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }

            System.out.println();
//            System.out.println("");

//            int[][] arr1 = new int[3][5];
//
//            for (int i = 0; i < arr1.length; i++) {
//                for (int j = 0; j < arr1[i].length; j++) {
//                    System.out.printf("%d ", arr1[i][j]);
//                }
//                System.out.println();
//            }


        }
    }
}

