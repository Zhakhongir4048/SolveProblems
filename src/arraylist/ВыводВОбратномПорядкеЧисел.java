package arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ВыводВОбратномПорядкеЧисел {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> integerArrayList = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            String console = reader.readLine();
            integerArrayList.add(Integer.parseInt(console));
        }

        for (int i = integerArrayList.size() - 1; i >= 0; i--) {
            System.out.println(integerArrayList.get(i));
        }
        // Другой вариант

     /*   for (int i = 0; i < integerArrayList.size(); i++)
         {
            int j = integerArrayList.size() - i - 1;
            System.out.println(integerArrayList.get(i));
         }                                                               */
    }


}
