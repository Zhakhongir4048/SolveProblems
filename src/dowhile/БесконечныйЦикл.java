package dowhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class БесконечныйЦикл {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Введи число 4");
            int a = Integer.parseInt(reader.readLine());
            if (a == 4 ){
                System.out.println("Вы ввели число 4");
                break;
            }
        }  while (true);
    }
}
