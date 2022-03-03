package stringbuilder;

public class ВозвращаетПодстрокуЗаданнуюИнтервалом {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Может погуляем, сегодня классная погода");

        String result = stringBuilder.substring(6);  // Возвращает подстроку, заданную интервалом
        System.out.println(result);
    }
}
