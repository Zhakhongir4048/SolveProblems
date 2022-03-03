package stringсomparisonmethodsstring;

public class СравниваетCтрокиИгнорируяРегистрБукв {
    public static void main(String[] args) {
        String string = "ТЕБЕ ПРИХОДИЛОСЬ БЫТЬ В АНГЛИИ?";
        String string1 = "тебе приходилось быть в англии?";

        boolean trueAndFalse = string.equalsIgnoreCase(string1); // Сравнивает строки, игнорируя регистр (размер) букв
        System.out.println(trueAndFalse);
    }
}
