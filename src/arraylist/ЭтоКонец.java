package arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ЭтоКонец {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> stringArrayList = new ArrayList<>();


        while (true) {

            String console = reader.readLine();
            if (console.equals("end")) break;
            stringArrayList.add(console);
        }

        for (String string : stringArrayList) {
            System.out.println(string);
        }


    }
}
