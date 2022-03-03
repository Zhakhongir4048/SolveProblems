package stringbuilder;

public class ВозвращаетCимволCтрокиПоЕгоИндексу {
    public static void main(String[] args) {
        // Возвращает символ строки по его индексу

        StringBuilder stringBuilder = new StringBuilder("не печалься, будь сильным!");

        char charAt = stringBuilder.charAt(13);
        System.out.println(charAt);
    }
}
