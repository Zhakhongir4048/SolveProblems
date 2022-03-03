package substringsearchmethodsstring;

public class ИщетCтрокуStrВТекущейСтрокеСКонцаПропустивIndexПервыхСимволов {
    public static void main(String[] args) {
        // Ищет строку str в текущей строке с конца, пропустив index первых символов

        String string = "К тебе нет претензий, помимо прочего";

        int lastIndexOf = string.lastIndexOf("п",12);

        System.out.println(lastIndexOf);
    }
}
/*
возвращает индекс, под которым символ или строка первый раз появляется в строке;
возвращает (-1) если символ или строка не найдены
 */