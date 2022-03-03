package integer;

public class РаботаIntegerCompare {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Dana Wait", 5, 2, 2);
        Cat cat2 = new Cat("Habib", 4, 3, 4);
        Cat cat3 = new Cat("Mac Gregor", 6, 5, 3);

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat1.fight(cat3));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
/* public static int compare(int x, int y) {
    return (x < y) ? -1 : ((x == y) ? 0 : 1);
}
Для наглядности этот код можно переписать так:

public static int compare(int x, int y) {
    if (x < y) {
        return -1;
    } else if (x == y) {
        return 0;
    } else {
        return 1;
    }
}
т. е. метод compare сравнивает два числа между собой и возвращает:

-1 - первое число меньше второго
0 - числа равны
1 - первое число больше второго

 */