package methodsstring;

import java.util.Scanner;

public class ПреобразовываетПутьКФайлуИзUnixStyleВWindowsStyleВторойСпособ {

    public static void main(String[] args) {

        // Решение 2. Использование методов split() и join()

        Scanner console = new Scanner(System.in);         //Создание объекта Scanner
        String path = console.nextLine();                  //Чтение строки с консоли

        String[] array = path.split("/");     // Преобразование строки в массив строк. В качестве разделителя используется символ / (дополнительные два слеша – это следствие двойного экранирования).


        String result = String.join("\\", array);   // Объедением все строки из массива строк, в качестве разделителя используется символ \ (мы видим его экранированным).


        System.out.println(result);           // Выводим строку на экран.
    }
}
