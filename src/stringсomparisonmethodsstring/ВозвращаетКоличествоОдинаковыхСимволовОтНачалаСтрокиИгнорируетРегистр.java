package stringсomparisonmethodsstring;

public class ВозвращаетКоличествоОдинаковыхСимволовОтНачалаСтрокиИгнорируетРегистр {
    public static void main(String[] args) {
        String string = "Добро пожаловать домой";
        String string1 = "ДОБРО ПОЖАЛОВАТЬ ДОМОЙ";

        int compareToIgnoreCase = string.compareToIgnoreCase(string1); //Возвращает количество одинаковых символов от начала строки, игнорирует регистр

        System.out.println(compareToIgnoreCase);
    }
}
