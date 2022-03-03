package arraylist;

import java.util.Arrays;
import java.util.List;

public class ПереводКоллекцииСтрокКСтроковомуПредставлению {
    public static void main(String[] args) {
        List<String> people = Arrays.asList(
                "Philip J. Fry",
                "Turanga Leela",
                "Bender Bending Rodriguez",
                "Hubert Farnsworth",
                "Hermes Conrad",
                "John D. Zoidberg",
                "Amy Wong"
        );

        String peopleString = String.join("; ", people);
        System.out.println(peopleString);
    /*
    Вывод:
    Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Zoidberg; Amy Wong
     */
    }
}
