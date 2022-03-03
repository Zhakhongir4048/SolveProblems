package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ПереключениеМеждуМассивомИArrayList {
    public static void main(String[] args) {

        Cat thomas = new Cat("Томас");
        Cat behemoth = new Cat("Бегемот");
        Cat philipp = new Cat("Филипп Маркович");
        Cat pushok = new Cat("Пушок");

        Cat[] catsArray = {thomas, behemoth, philipp, pushok};

        ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));
        System.out.println(catsList);
    }
}
class Cat{
      private String name;

    public Cat(String name){
        this.name = name;
    }



    public String toString(){
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}