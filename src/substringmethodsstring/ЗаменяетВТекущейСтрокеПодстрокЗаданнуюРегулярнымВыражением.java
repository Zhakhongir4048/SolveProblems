package substringmethodsstring;

public class ЗаменяетВТекущейСтрокеПодстрокЗаданнуюРегулярнымВыражением {
    public static void main(String[] args) {
        String string = "Красивые и заёбистые";

        String string1 = string.replaceFirst("заёбистые", "пышные");  // Заменяет в текущей строке подстроку, заданную регулярным выражением

        System.out.println(string1);
    }
}
