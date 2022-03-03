package arrays;

import java.util.Arrays;

public class КлассArraysКопированиеМассиваЧастиМассива {
    public static void main(String[] args) {
        //  тип[] имя2 = Arrays.copyOf(имя1, длина);

        int[] x = {1,2,3,4,5,6,7,8,9,10};
        String str = Arrays.toString(x);
        System.out.println(str);

        //   Переменная str1 содержит значение
        //  "[1, 2, 3, 4, 5]"
        int[] x1 = Arrays.copyOf(x,5);
        String str1 = Arrays.toString(x1);
        System.out.println(str1);


        //   Переменная str2 содержит значение
        //  "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0]"
        int[] x2 = Arrays.copyOf(x,15);
        String str2 = Arrays.toString(x2);
        System.out.println(str2);

        // тип[] имя2 = Arrays.copyOfRange(имя, первый, последний);

        int[] x3 = {11,12,13,14,15,16,17,18,19,20};


        // Переменная str3 содержит значение
        // "[16, 17, 18, 19, 20]"
        int[] x4 = Arrays.copyOfRange(x3,5,10);
        String str3 = Arrays.toString(x4);
        System.out.println(str3);


        // Переменная str3 содержит значение
        // "[16, 17, 18, 19, 20, 0, 0, 0, 0, 0]"
        int[] x5 = Arrays.copyOfRange(x3,5,15);
        String str4 = Arrays.toString(x5);
        System.out.println(str4);


    }
}
