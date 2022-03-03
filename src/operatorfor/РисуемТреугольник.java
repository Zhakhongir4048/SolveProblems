package operatorfor;

public class РисуемТреугольник {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;

        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j < b+i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
