package arrays;

import java.util.Arrays;

public class КлассArraysСравниваниеМассивовДвумерныхМассивов {
    public static void main(String[] args) {
        // Arrays.equals(имя1, имя2);

        int[] x1 = {1,2,3};
        int[] x2 = {1,2,3};
        System.out.println(Arrays.equals(x1,x2));

        // Arrays.deepEquals(имя1 , имя2);

        int[][] x3 = { {1,2,3}, {4,5,6}};
        int[][] x4 = { {1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepEquals(x3,x4));
    }
}
