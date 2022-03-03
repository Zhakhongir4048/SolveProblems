package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ВыводНаЭкранЭлементовSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        // Получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())              // проверка, есть ли ещё элементы
        {
            // Получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }
    }
}
