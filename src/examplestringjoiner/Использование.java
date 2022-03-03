package examplestringjoiner;

import java.util.StringJoiner;

public class Использование {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(";");
        joiner.add("foo");
        joiner.add("bar");
        joiner.add("baz");

        String joined = joiner.toString();
        System.out.println(joined);

        StringJoiner joined1 = new StringJoiner("-");
                joined1.add("foo");
                joined1.add("bar");
                joined1.add("baz");
                joined1.toString();
        System.out.println(joined1);
    }
}
