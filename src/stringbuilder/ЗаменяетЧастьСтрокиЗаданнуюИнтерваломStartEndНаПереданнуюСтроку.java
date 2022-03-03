package stringbuilder;

public class ЗаменяетЧастьСтрокиЗаданнуюИнтерваломStartEndНаПереданнуюСтроку {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Как тебе без меня?");
        stringBuilder.replace(8,18, " мой уход, знаю точно ты думаешь обо мне");
        System.out.println(stringBuilder);
    }
}
// Заменяет часть строки, заданную интервалом start..end на переданную строку