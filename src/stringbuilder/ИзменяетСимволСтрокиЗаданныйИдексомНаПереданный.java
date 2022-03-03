package stringbuilder;

public class ИзменяетСимволСтрокиЗаданныйИдексомНаПереданный {
    // Изменяет символ строки, заданный индексом на переданный

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("К тебе сегодня приду");

        stringBuilder.setCharAt(2, 'c');       //void setCharAt(int index, char)

        System.out.println(stringBuilder);
    }
}
