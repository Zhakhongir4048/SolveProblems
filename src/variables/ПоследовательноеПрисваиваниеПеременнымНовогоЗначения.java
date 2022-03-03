package variables;

public class ПоследовательноеПрисваиваниеПеременнымНовогоЗначения {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        y = x + y;          // y = 14        2+12

        x = y - x;         // x = 12         14-2

        y = y - x;         // y = 2           14-12

        System.out.println(x);
        System.out.println(y);
    }
}
