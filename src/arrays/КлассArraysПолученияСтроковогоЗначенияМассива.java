package arrays;

import java.util.Arrays;

public class КлассArraysПолученияСтроковогоЗначенияМассива {
    public static void main(String[] args) {
        // String str = Arrays.toString(имя);

        int[] array = {1,2,3};
        String str = Arrays.toString(array);
        System.out.println(str);

        int[] array1 = {};
        String str1 = Arrays.toString(array1);
        System.out.println(str1);

        String[] array2 = {"Привет", "\nКак", "\nДела\n"};
        String str2 = Arrays.toString(array2);
        System.out.println(str2);

        // String str = Arrays.deepToString(имя);
        int[] array3 = {1,2,3};
        String str3 = Arrays.toString(array3);
        System.out.println(str3);

        int[][] array4 = { {1,1}, {2,2}, {3,3} };
        String str4 = Arrays.deepToString(array4);
        System.out.println(str4);

        int[][][] array5 = { {{1,2,3}, {1}}, {{}} };
        String str5 = Arrays.deepToString(array5);
        System.out.println(str5);

    }
}
