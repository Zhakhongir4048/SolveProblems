package stringbuilder;

public class ПреобразовываетПереданныйОбъектВСтрокуИВставляетВТекущуюСтроку {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Привет, как дела?");
        stringBuilder.insert(7," Джавид,");
        System.out.println(stringBuilder);
    }
}
