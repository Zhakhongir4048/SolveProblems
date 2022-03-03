package stringpool;

public class МетодIntern {
    public static void main(String[] args) {
        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println(a == b);           // false

        String c = new String("hello");
        String v = new String("hello");

        String t = c.intern();
        String t1 = v.intern();

        System.out.println(c == v);             // false
        System.out.println(t == t1);           // true
    }
}
