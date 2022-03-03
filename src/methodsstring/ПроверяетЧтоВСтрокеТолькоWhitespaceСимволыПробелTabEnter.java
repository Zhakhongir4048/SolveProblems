package methodsstring;

public class ПроверяетЧтоВСтрокеТолькоWhitespaceСимволыПробелTabEnter {
    public static void main(String[] args) {
        String string = "               ";
        boolean trueAndFalse = string.isBlank();    // Проверяет, что в строке — только whitespace-символы: пробел, tab, enter и т.п.
        System.out.println(trueAndFalse);
    }
}
