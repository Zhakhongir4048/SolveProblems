package operatorfor;

import java.util.Scanner;

public class СреднееИзТрёхЧисел {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b && a >= c || a >= b && a <= c) {
            System.out.println(b);
        } else

        if (b >= a && b <= c || b <= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
