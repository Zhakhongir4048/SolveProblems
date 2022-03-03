package stringbuilder;

public class УдаляетИзСтрокиСимволПодНомеромIndex {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Как тебе спалось? Ночью так представляю тебя голой!");

        stringBuilder.deleteCharAt(16);        // Удаляет из строки символ под номером index
        System.out.println(stringBuilder);
    }
}
