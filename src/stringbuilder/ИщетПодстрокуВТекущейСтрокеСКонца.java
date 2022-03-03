package stringbuilder;

public class ИщетПодстрокуВТекущейСтрокеСКонца {
    // Ищет подстроку в текущей строке с конца

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Почему так ты поступаешь, так не надо");

        int lastIndexOf = stringBuilder.lastIndexOf("так");
        System.out.println(lastIndexOf);
    }
}
