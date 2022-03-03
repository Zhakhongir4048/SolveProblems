package foreach;

import java.util.HashSet;
import java.util.Set;

public class ВыводНаЭкранЭлементовSet {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        for (String text : set)
        {
            System.out.println(text);
        }
    }
}
