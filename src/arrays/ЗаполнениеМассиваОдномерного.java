package arrays;

import java.io.IOException;

public class ЗаполнениеМассиваОдномерного {
    public static void main(String[] args) throws IOException {
        String[] strings = new String[5];
        int a = strings.length;           // получаем число 5 количество ячеек в массиве strings


        strings[1] = " Мама";             //
        String s = strings[1];

        // Заполнение массива из 10 чисел, числами от 1 до 10

        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = 1 + i;
            System.out.print(ints[i] + " ");
        }

        System.out.println();

        // Заполнение массива из 10 чисел от 10 до 1
        int[] ints1 = new int[10];

        for (int i = 0; i < ints1.length ; i++) {
            ints1[i] = 10 - i;
            System.out.print(ints1[i] + " ");
        }

        System.out.println();

        // Заполнение массива из 10 чисел от 0 до 9

        int[] ints2 = new int[10];

        for (int i = 0; i < ints2.length; i++) {
            ints2[i] = i;
            System.out.print(ints2[i] + " ");
        }

        System.out.println();

        // Заполнение массива из 10 чисел от 9 до 0

        int[] ints3 = new int[10];

        for (int i = 0; i < ints3.length ; i++) {
            ints3[i] = 9 - i;
            System.out.print(ints3[i] + " ");
        }

    }
}
