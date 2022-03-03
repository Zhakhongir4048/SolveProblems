package substringmethodsstring;

public class ВозвращаетНовуюСтрокуЗаменяетСимволOldCharНаСимволNewChar {
    public static void main(String[] args) {
        String string = "Встречают по одёжке, провожают по уму";

        String string1 = string.replace('о','0'); // 	Возвращает новую строку: заменяет символ oldChar на символ newChar

        System.out.println(string1);
    }
}
