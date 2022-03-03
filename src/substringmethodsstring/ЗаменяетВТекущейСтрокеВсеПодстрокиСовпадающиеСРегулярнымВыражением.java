package substringmethodsstring;

public class ЗаменяетВТекущейСтрокеВсеПодстрокиСовпадающиеСРегулярнымВыражением {
    public static void main(String[] args) {
        String string = "Небо над нами, солнце над нами";

        String string1 = string.replaceAll("нами", "ними"); // Заменяет в текущей строке все подстроки, совпадающие с регулярным выражением

        System.out.println(string1);
    }
}
