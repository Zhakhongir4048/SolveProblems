package stringbuilder;

public class РазворачиваетCтрокуЗадомНаперед {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Погода шикарна");

        StringBuilder result = stringBuilder.reverse();

        System.out.println(result);
    }
}
