package stringсomparisonmethodsstring;

public class ПроверятЧтоТекущаяСтрокаЗаканчиваетсяНаСтроку {
    public static void main(String[] args) {
        String string = "Тебе так хочется меня в сексе";
        boolean trueAndFalse = string.endsWith("сексе");  // Проверят, что текущая строка заканчивается на строку, которую мы задаём в методе

        System.out.println(trueAndFalse);
    }
}
