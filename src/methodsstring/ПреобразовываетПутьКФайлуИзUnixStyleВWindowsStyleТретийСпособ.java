package methodsstring;

import java.util.Scanner;

public class ПреобразовываетПутьКФайлуИзUnixStyleВWindowsStyleТретийСпособ {
    public static void main(String[] args) {

      //  Решение 3. Использование метода replace(char oldChar, char newChar)

        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String result = path.replace('/', '\\');

        System.out.println(result);
    }
}
