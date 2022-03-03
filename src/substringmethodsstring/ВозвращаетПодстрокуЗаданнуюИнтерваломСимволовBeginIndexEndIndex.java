package substringmethodsstring;

public class ВозвращаетПодстрокуЗаданнуюИнтерваломСимволовBeginIndexEndIndex {
    public static void main(String[] args) {
        String string = "Привет, какие планы на сегодня?";

        String string1 = string.substring(8,13);  // Возвращает подстроку, заданную интервалом символов beginIndex..endIndex

        System.out.println(string1);
    }
}
