package operatorfor;

import java.util.Scanner;

public class РисуемПрямоугольник {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
