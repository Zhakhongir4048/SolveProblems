package arraylist;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class УдвойСлова {
    public static void main(String[] args)  throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            String console = reader.readLine();
            strings.add(console);
        }


        ArrayList<String> result = doubleList(strings);

        for (String s: result) {
            System.out.println(s);
        }
    }




    public static ArrayList<String> doubleList(ArrayList<String> list){

        for (int i = 0; i < list.size(); i++) {
            list.add(0 + i, list.get(i));
            i++;
        }

        return list;



    }
}
