package operatorfor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class БесконечныйЦикл {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (boolean isExit = false; !isExit; )   // 1 пример
        {
            String s = reader.readLine();
            isExit = s.equals("exit");
        }

        for (; true; )                           // 2 пример
        {
            String s = reader.readLine();
            if (s.equals("exit"))
                break;
        }

    }
}
