package methodsstring;

public class ПереводОбъектаПримитиваВСтроку {
    public static void main(String[] args) {
        String a = String.valueOf(1);
        String b = String.valueOf(12.0D);
        String c = String.valueOf(123.4F);
        String d = String.valueOf(123456L);
        String s = String.valueOf(true);
        String human = String.valueOf(new Human("Alex"));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
        System.out.println(human);
        /*
        Вывод:
        1
        12.0
        123.4
        123456
        true
        Человек с именем Alex
         */
    }

    static class Human {
        private String name;

        public Human(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Человек с именем " + name;
        }
    }
}


