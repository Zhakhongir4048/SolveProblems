package arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ВводСпискаЦелыхЧиселСКлавиатуры {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        while (true){

            String s = reader.readLine();
            if(s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }
     }
}
