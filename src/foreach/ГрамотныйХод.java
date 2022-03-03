package foreach;

public class ГрамотныйХод {
    public  static void sayHi(String...names) {

        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

    public static void main(String[] args) {
         sayHi("Джоха", "Никита","Джавид");
    }
}
