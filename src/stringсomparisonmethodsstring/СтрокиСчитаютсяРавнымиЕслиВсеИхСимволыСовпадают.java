package stringсomparisonmethodsstring;

public class СтрокиСчитаютсяРавнымиЕслиВсеИхСимволыСовпадают {
    public static void main(String[] args) {

        String string = "Всем доброго дня";
        String string1 = "Всем доброго дня";

        boolean trueAndFalse = string.equals(string1);  //Строки считаются равными, если все их символы совпадают
        System.out.println(trueAndFalse);
    }
}
