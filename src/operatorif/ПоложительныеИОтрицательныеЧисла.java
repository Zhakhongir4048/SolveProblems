package operatorif;

import java.util.Scanner;

public class ПоложительныеИОтрицательныеЧисла {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int tree = scanner.nextInt();

        int positive = 0;
        int negative = 0;

        if (one > 0) {
            positive++;
        }

        if (two > 0) {
            positive++;
        }
        if (tree > 0) {
            positive++;
        }

        if (one < 0) {
            negative++;
        }

        if (two < 0) {
            negative++;
        }
        if (tree < 0) {
            negative++;
        }

        System.out.println(positive);
        System.out.println(negative);

    }
}
