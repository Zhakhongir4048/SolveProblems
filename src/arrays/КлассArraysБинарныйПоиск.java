package arrays;

import java.util.Arrays;

public class КлассArraysБинарныйПоиск {
    public static void main(String[] args) {
        int[] x = {11,-2,3,0,999,-20,8,-20,99,-20};
        Arrays.sort(x);
        // x содержит
        // {-20, -20, -20, -2, 0, 3, 8, 11, 99, 999}


        int index = Arrays.binarySearch(x,0);        // 4
        int index1 = Arrays.binarySearch(x,-20);      // 1 (также подходили индексы  0, 2)
        int index2 = Arrays.binarySearch(x,99);     //  8
        int index3 = Arrays.binarySearch(x,5);      // -7
    }
}
