package stringbuilder;

public class ИщетПодстрокуВТекущейСтроке {
    // Ищет подстроку в текущей строке

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Добро пожаловать домой");

        int indexOf = stringBuilder.indexOf("домой", 12);
        System.out.println(indexOf);

    }
}
/* Мы можем не задавать индекс откуда начинать поиск */