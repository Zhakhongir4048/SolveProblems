package substringsearchmethodsstring;

import java.util.Scanner;

public class МеняемИмяДомена {
    public static void main(String[] args) {

        //  «https://domen.ru/about/reviews», и мы хотим заменить имя домена на javarush.ru.

        Scanner console = new Scanner(System.in);                  // Создание объекта Scanner
        String path = console.nextLine();                          // Чтение строки с консоли

        int index = path.indexOf("//");                            // Получаем индекс первого вхождения строки //
        int index2 = path.indexOf("/", index + 2);    // Получаем индекс первого вхождения строки /, но ищем только после символов //

        String first = path.substring(0, index + 2);           //  Получаем строку от начала и заканчивая символами //
        String last = path.substring(index2);                   // Получаем строку от / и до конца.

        String result = first + "javarush.ru" + last;                    // Склеиваем строки и новый домен.
        System.out.println(result);
    }
}
