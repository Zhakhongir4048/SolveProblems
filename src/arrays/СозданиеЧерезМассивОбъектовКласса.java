package arrays;

public class СозданиеЧерезМассивОбъектовКласса {
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");


    }
}

class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }


}
