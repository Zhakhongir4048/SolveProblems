package stringсomparisonmethodsstring;

public class СравниваетЧастиСтрок {
    public static void main(String[] args) {
        String string = "Иди ко мне, Алина, как ты?";
        String string1 = "Иди ко мне, Вали отсюда!";

        boolean trueAndFalse = string.regionMatches(0, string1, 0, 10);

        System.out.println(trueAndFalse);

        String Str1 = new String("Добро пожаловать на ProgLang.su");
        String Str2 = new String("ProgLang");
        String Str3 = new String("PROGLANG");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str1.regionMatches(20, Str2, 0, 8));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str1.regionMatches(20, Str3, 0, 8));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str1.regionMatches(true, 20, Str3, 0, 8));


    }
}
/*
toffset — начальное смещение субобласти в этой строке;
other — строковый аргумент;
ooffset — начальное смещение субобласти в строковом аргументе;
len — количество символов для сравнения;
ignoreCase — значение true, если не учитывать регистр при сравнении символов.

 */