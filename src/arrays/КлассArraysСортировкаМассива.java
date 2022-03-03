package arrays;

import java.util.Arrays;

public class КлассArraysСортировкаМассива {
    public static void main(String[] args) {
        // Arrays.sort(имя);

        int[] x = {11,-2,3,0,999,-20,8, -20,99,-20};

        Arrays.sort(x);
        String str = Arrays.toString(x);
        System.out.println(str);


        // Arrays.sort(имя, первый , последний);


        int[] x1 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};

        Arrays.sort(x1,4,8);
        String str1 = Arrays.toString(x1);
        System.out.println(str1);

    }
}
