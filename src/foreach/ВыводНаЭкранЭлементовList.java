package foreach;

import java.util.ArrayList;
import java.util.List;

public class ВыводНаЭкранЭлементовList {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        list.add("Mila");
        list.add("Ramu");

        for (String text : list)
        {
            System.out.println(text);
        }
    }
}
