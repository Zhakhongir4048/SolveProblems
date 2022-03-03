package foreach;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class РаспределениеПоТрёмМассивам {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> divBy3 = new ArrayList<>();
    public static ArrayList<Integer> divBy2 = new ArrayList<>();
    public static ArrayList<Integer> others = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
        }

        for (Integer integer : numbers) {
            if (integer % 3 == 0) {
                divBy3.add(integer);
            }
        }

        for (Integer integer : numbers) {
            if (integer % 2 == 0) {
                divBy2.add(integer);
            }
        }

        for (Integer integer : numbers) {
            if (integer % 2 != 0 && integer % 3 == 0) {
                others.add(integer);
            }
        }

        printList(divBy3);
        printList(divBy2);
        printList(others);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer number : list) {
            System.out.println(number);
        }
    }
}
