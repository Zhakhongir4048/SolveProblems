package arraylist;

import java.util.ArrayList;

public class ДобавлениеПослеКаждогоСлова {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();


        list.add("мама");
        list.add("мыла");
        list.add("раму");

        for (int i = 0; i < list.size(); i++) {
            list.add(list.size() - i, "именно");
            i++;
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
