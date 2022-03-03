package bufferedreaderandinputstreamreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Синтаксис {

    public class BufferedReaderAndInputStreamReader {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String consoleString  = bufferedReader.readLine();
            int consoleInt = Integer.parseInt(bufferedReader.readLine());

            System.out.println(consoleString + " " + consoleInt);
        }
    }

}
