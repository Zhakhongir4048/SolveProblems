package methodsstring;

import java.util.Arrays;

public class ПреобразуетCтрокуВНаборБайтИВозвращаетМассивБайт {
    public static void main(String[] args) {
        String string = "Люби меня люби, сегодня как никогда";
        byte[] getBytes = string.getBytes();      // Преобразует строку в набор байт и возвращает массив байт.
        System.out.println(Arrays.toString(getBytes));
    }
}
