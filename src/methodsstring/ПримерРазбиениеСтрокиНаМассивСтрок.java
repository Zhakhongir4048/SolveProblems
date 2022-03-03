package methodsstring;

public class ПримерРазбиениеСтрокиНаМассивСтрок {
    public static void main(String[] args) {
        String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Zoidberg; Amy Wong";

        String[] peopleArray = people.split("; ");
        for (String human : peopleArray) {
            System.out.println(human);
        }
    /*
    Вывод:
    Philip J. Fry
    Turanga Leela
    Bender Bending Rodriguez
    Hubert Farnsworth
    Hermes Conrad
    John D. Zoidberg
    Amy Wong
     */
    }
}
