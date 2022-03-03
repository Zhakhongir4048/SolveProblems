package stringtokenizer;

import java.util.StringTokenizer;

public class УзнатьКоличествоСловВСтроке {
    public static void main(String[] args) {
        String string = "Добро пожаловать домой,как тебе наша хата?";
        int result  = wordCount(string);
        System.out.println("Сколько слов в предложении - \"" + string + "\" Слов всего " + result);

    }

    public static int wordCount(String string){
        StringTokenizer stringTokenizer = new StringTokenizer(string);
        int wordCount = 0;
        while (stringTokenizer.hasMoreTokens()){
            stringTokenizer.nextToken();
            wordCount++;
        }
        return wordCount;
    }
}
