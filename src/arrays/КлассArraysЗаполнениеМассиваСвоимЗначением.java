package arrays;

import java.util.Arrays;

public class КлассArraysЗаполнениеМассиваСвоимЗначением {
    public static void main(String[] args) {
        // Arrays.fil(имя, значение);

        int[] x = new int[100];
        Arrays.fill(x,999);

        for (int i = 0; i < x.length ; i++) {
            System.out.print(x[i] + " ");
        }

        System.out.println();

        // Arrays.fill(имя, первый,последний, значение);

        int[] y = {1,2,3,4,5,6,7,8,9,10};

        Arrays.fill(y,3,7,999);

        String str = Arrays.toString(y);
        System.out.println(str);

        // Заполняем ячейки y[3], y[4], y[5], y[6] значением 999 Нумерация ячеек массива с нуля!
        // Переменная str содержит значение "[1, 2, 3, 999, 999, 999, 999, 8, 9, 10]"

    }
}
