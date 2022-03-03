package methodsstring;

import java.util.Scanner;

public class ПреобразовываетПутьКФайлуИзUnixStyleВWindowsStyleПервыйСпособ {
    public static void main(String[] args) {


        // Решение 1. Использование массива char’ов

        Scanner console = new Scanner(System.in);    // Создание объекта Scanner
        String path = console.nextLine();            // Чтение строки с консоли

        char[] chars = path.toCharArray();          // Преобразование строки в массив символов
        for (int i = 0; i < chars.length; i++)      // Цикл по символам

            if (chars[i] == '/')                    // Если цикл равен /
                chars[i] = '\\';                    // Заменить кго на \ . Не забываем про экранирование


        String result = new String(chars);          // Создаём новую строку на основе массива символов
        System.out.println(result);                 // Выводим строку на экран

    }

}
