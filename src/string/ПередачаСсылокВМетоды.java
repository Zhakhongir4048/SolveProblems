package string;

public class ПередачаСсылокВМетоды {
    public class Swap {


        public static void main(String[] args) throws InterruptedException {
            Student olga = new Student();
            olga.name = "Olga";
            olga.age = 21;

            Student vera = new Student();
            vera.name = "Veronika";
            vera.age = 15;

            System.out.println("Olga is " + olga.age);
            System.out.println("Vera is " + vera.age);

            ageSwap(olga, vera);

            System.out.println("Olga is " + olga.age);
            System.out.println("Vera is " + vera.age);


            float f = 3 / 5.0f;
            System.out.println(f);
        }

        private static void ageSwap(Student a,
                                    Student b) {
            int c = a.age;
            a.age = b.age;
            b.age = c;
        }

        static class Student {
            String name;
            int age;
        }

    /*public static void main(String[] args) {
        int m = 5;
        int n = 6;

        System.out.println("M=" + m + " N=" + n);
        swap(m, n);
        System.out.println("M=" + m + " N=" + n);
    }

    private static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }                                            */


    }
}