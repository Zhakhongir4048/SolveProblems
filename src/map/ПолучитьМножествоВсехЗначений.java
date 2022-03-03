package map;

import java.util.HashMap;
import java.util.Map;

public class ПолучитьМножествоВсехЗначений {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();

        integerStringMap.put(1, "первый");
        integerStringMap.put(2, "второй");
        integerStringMap.put(3, "третий");
        integerStringMap.put(4, "четвёртый");
        integerStringMap.put(5, "пятый");


        System.out.println(integerStringMap.values());

    }
}
