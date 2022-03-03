package stringformat;

public class ПримерыИспользования {
    public static void main(String[] args) {
        // String имя = String.format(шаблон, параметры);


        String s = String.format("a=%d, b=%d, c=%d", 1, 4, 3);
        System.out.println(s);

        String s1 = String.format("a=%3$d, b=%2$d, c=%d", 11, 12, 13);
        System.out.println(s1);

        


    }
}
/*

%s - String
%d - целое число: byte,  short, int, long
%f -вещественное число: float, double
%b - boolean
%c -char
%t -Date
%% - Символ %

 */
/* %3$d возьмет 3-й параметр-переменную, %2$d возьмет второй параметр. %d возьмет самый первый параметр-переменную
Параметры шаблона %s, %d обращаются к переменным-параметрам независимо от параметров шаблона типа %3$d или %2$s
 */