package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ЗаполнениеМассиваВводом {
    public static void main(String[] args) throws Exception {
        // Ввод 10 строк с клавиатуры

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings1 = new String[10];

        for (int i = 0; i < strings1.length; i++) {
            strings1[i] = reader.readLine();
        }

        for (String s1 : strings1){
            System.out.print(s1 + " ");
        }

        // Ввод 10 чисел с клавиатуры

        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        for (int i : ints){
            System.out.print(i + " ");
        }
    }
}
