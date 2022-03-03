package foreach;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class УдвойСлова {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String console = reader.readLine();
            list.add(console);
        }


        ArrayList<String> result = doubleValues(list);

        for (String string : result) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String string : list) {
            result.add(string);
            result.add(string);
        }
        return result;
    }
}
