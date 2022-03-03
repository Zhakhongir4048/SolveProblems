package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class УдалениеЭлементаКоллекции {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 0, -5, -7, -12, 5, 15);

        ArrayList<Integer> copy = new ArrayList<Integer>(list);
        for (Integer value: copy)
            if (value < 0)
                list.remove(value);


        for (Integer a : list){
            System.out.println(a);
        }

            /*
            list.removeIf( x-> x<0 );   // можно вот так просто:)
            */
    }
}
