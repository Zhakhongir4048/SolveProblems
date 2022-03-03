package methodsstring;

public class ВозвращаетМассивСимволовИзКоторыхСостоитСтрока {
    public static void main(String[] args) {
        String string = "Сегодня день весны";
        char[] toCharArray = string.toCharArray();       // Возвращает массив символов (копию), из которых состоит строка
        System.out.println(toCharArray);
    }
}
