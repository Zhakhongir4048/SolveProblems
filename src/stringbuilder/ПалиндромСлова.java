package stringbuilder;

public class ПалиндромСлова {
    public static void main(String[] args) {
        String word = "Ротор";
        String answer = isPalindrome(word) ? "Да" : "Нет";
        System.out.println("Слово \"" + word + "\" палиндром? " + answer);
    }

    public static boolean isPalindrome(String word) {
        StringBuilder builder = new StringBuilder(word);             // создаём StringBuilder
        builder.reverse();                                          // переворачиваем строку
        return word.equalsIgnoreCase(builder.toString());          //  сравнием строку которая передаётся в параметры метода с словом которую перевернули
    }
}
