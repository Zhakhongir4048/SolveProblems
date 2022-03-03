package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ПреобразованиеArrayListКОбычномуМассиву {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();

        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(behemoth);
        cats.add(philipp);
        cats.add(pushok);

        Cat[] catsArray = cats.toArray(new Cat[0]);

        System.out.println(Arrays.toString(catsArray));
    }

    public static class Cat{
        String name;

        public Cat(String name){
            this.name = name;
        }

        public String toString(){
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
