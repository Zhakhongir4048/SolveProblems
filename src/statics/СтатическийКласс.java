package statics;

public class СтатическийКласс {

        private static int catCount = 0;
        private int shot = 10;

        public static void main(String[] args) throws Exception
        {
            Cat vaska = new Cat("Bella");
            Cat merka = new Cat("Tiger");

            System.out.println("Cat count " + catCount);
        }

        public static class Cat     // Класс Cat может обращаться только к статическим переменным класса StaticClassExample
        {
            private String name;

            public Cat(String name)
            {
                this.name = name;
                СтатическийКласс.catCount++;
            }
        }

    }

