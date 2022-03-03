package whileexample;

import java.util.Scanner;

public class Суммирование {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int a = scanner.nextInt();
            sum += a;

            if (a == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}
