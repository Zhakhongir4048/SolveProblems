package operatorfor;

public class ИспользованиеПримеры {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();    //  это одно и тоже что и  System.out.print('\n');
        }




        int a = 0;

        for (int i = 5; i > 0; i--, a++) {
            System.out.println("Шаг: " + a + " значение " + i);
        }


        for(int i = 5, j = 11; i != j; i++, j--) {
            System.out.println("i: " + i + " j: " + j);
        }
    }
}
