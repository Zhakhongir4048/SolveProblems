package arraylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ВыводСписокСловВОбратномПорядке {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            list.add(string);
        }

        list.remove(2);

        for (int i = list.size() - 1; i >= 0; i--) {
            String string = list.get(i);
            System.out.println(string);
        }

  /*        for (int i = 0; i < list.size(); i++) {
            int j = list.size() - i -1;       // получаем индекс с последнего до самого первого
            System.out.println(list.get(j));
        }                                               */
    }
}
