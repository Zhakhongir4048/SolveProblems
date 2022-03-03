package substringmethodsstring;

public class УдаляетВсеПробелыВНачалеИКонцеСтроки {
    public static void main(String[] args) {
        String string = "         Можно поменять многое не только за один год, но даже за один день, впервую очередь способ мышления!        ";

        String string1 = string.trim();  // Удаляет все пробелы в начале и конце строки

        System.out.println(string1);
    }
}
