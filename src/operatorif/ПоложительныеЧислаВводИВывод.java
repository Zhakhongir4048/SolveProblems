package operatorif;

import java.util.Scanner;

public class ПоложительныеЧислаВводИВывод {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int count = 0;

        if (number1 > 0) {
            count++;
        }

        if (number2 > 0) {
            count++;
        }

        if (number3 > 0) {
            count++;
        }

        System.out.println(count);
    }
}
