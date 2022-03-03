package stringbuilder;

public class ПреобразовываетПереданныйОбъектВСтрокуИДобавляетКТекущейСтроке {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Привет");
        stringBuilder.append("Пока");          // Преобразовывает переданный объект в строку и добавляет к текущей строке
        stringBuilder.append(123);

        System.out.println(stringBuilder);
    }
}
