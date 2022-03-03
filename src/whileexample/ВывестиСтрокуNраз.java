package whileexample;

import java.util.Scanner;

public class ВывестиСтрокуNраз {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = scanner.nextInt();

        while (count > 0){
            System.out.println(text);
            count--;
        }
    }
}
