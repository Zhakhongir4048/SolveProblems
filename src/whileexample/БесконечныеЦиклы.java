package whileexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class БесконечныеЦиклы {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean isExit = false;

        while (!isExit) {
            String s = bufferedReader.readLine();
            isExit = s.equals("exit");
        }

        // бесконечные циклы

        while (true) {
            String s = bufferedReader.readLine();
            if (s.equals("exit"))
                break;
        }
    }
}
