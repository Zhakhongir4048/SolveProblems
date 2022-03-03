package methodsstring;

import java.util.StringJoiner;

public class СклеиваетВместеНесколькоПодстрок {
    public static void main(String[] args) {
        String string = "Люби эту жизнь верь в то что цели достижимы на пути";
        String s = " ага, скоро сам увидишь";
        String join = string.join(",", "моя", " игра", s); // Склеивает вместе несколько подстрок
        System.out.println(join);


    }
}
