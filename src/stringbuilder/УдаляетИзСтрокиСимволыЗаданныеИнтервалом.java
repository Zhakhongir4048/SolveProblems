package stringbuilder;

public class УдаляетИзСтрокиСимволыЗаданныеИнтервалом {
    public static void main(String[] args) {
        // Удаляет из строки символы, заданные интервалом

        StringBuilder stringBuilder = new StringBuilder("Ну что, как я тебе в постеле?");
        stringBuilder.delete(0,19);        // Удаляет из строки символы, заданные интервалом

        System.out.println(stringBuilder);
    }
}
