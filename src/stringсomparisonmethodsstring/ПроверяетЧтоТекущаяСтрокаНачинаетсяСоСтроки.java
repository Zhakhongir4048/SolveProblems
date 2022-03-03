package stringсomparisonmethodsstring;

public class ПроверяетЧтоТекущаяСтрокаНачинаетсяСоСтроки {
    public static void main(String[] args) {
        String string = "Сколько тебе лет?";
        boolean trueAndFalse = string.startsWith("Нисколько");  // Проверяет, что текущая строка начинается со строки, которую мы задаём в методе
        System.out.println(trueAndFalse);
    }
}
