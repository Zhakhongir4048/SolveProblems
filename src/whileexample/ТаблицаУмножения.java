package whileexample;

public class ТаблицаУмножения {
    public static void main(String[] args) {
        int a = 1;
        while (a > 0) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {

                    System.out.print(i * j + "  ");
                }
                System.out.println();
            }
            a--;
        }
    }
}
