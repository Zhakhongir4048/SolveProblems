package substringsearchmethodsstring;

public class ПроверяетЧтоТекущаяСтрокаСовпадаетСШаблономЗаданнымРегулярнымВыражением {

    public static void main(String[] args) {
      //  Проверяет, что текущая строка совпадает с шаблоном, заданным регулярным выражением
        String string = "Почему всё так делается";

        boolean matches = string.matches("Почему всё так делается"); // Проверяет, что текущая строка совпадает с шаблоном, заданным регулярным выражением
        System.out.println(matches);
    }
}
