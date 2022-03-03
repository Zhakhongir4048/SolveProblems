package equals;

import java.util.Scanner;

public class СравнениеОбъектов {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s1 = console.nextLine();
        String s2 = console.nextLine();
        if (s1.equals(s2))
        {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }
    }
}
