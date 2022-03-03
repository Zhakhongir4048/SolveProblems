package stringbuilder;

public class ВозвращаетДлинуСтрокиВСимволах {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Иду на таран!");

        int length = stringBuilder.length();

        System.out.println(length);

       //  Чтобы преобразовать объект StringBuilder к строке типа String, нужно просто вызвать у него метод toString()

        StringBuilder builder = new StringBuilder("Привет");
        builder.append(123);
        String result = builder.toString();
        System.out.println(result);
    }
}
