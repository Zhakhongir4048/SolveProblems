package methodsstring;

public class КоличествоСловВСтроке {
    public static void main(String[] args) {
        String string = "Что думаешь? Тебе всё с рук выйдет";
        int result = wordCount(string);
        System.out.println("Слов в строке \"" + string + "\" равно " + result);
    }

    public static int wordCount(String string) {
        return string.split(" ").length;
    }
}
/*
Если только пробелы разделители, то можно

int blockCount = "1215 544 965".split(" ").length;

Если пробелов между словами несколько

int blockCount = "1215     544      965".split(" +").length;
 */