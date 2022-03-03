package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class УдалениеОпределённогоЭлемента {
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


        Iterator<Cat> catIterator = cats.iterator();//создаем итератор
        while (catIterator.hasNext()) {//до тех пор, пока в списке есть элементы

            Cat nextCat = catIterator.next();//получаем следующий элемент
            if (nextCat.name.equals("Филипп Маркович")) {
                catIterator.remove();//удаляем кота с нужным именем
            }
        }

        System.out.println(cats);
    }
}

class Cat {
   public String name;

    public Cat(String name) {
        this.name = name;
    }


    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}