package stringtokenizer;

import java.util.StringTokenizer;

public class ПримерИспользования {
    public static void main(String[] args) {
        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str, "ne");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
// — Обрати внимание, что разделителем считается каждый символ строки, переданный второй строкой в конструктор StringTokenizer