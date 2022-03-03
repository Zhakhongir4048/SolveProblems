package operatorreturn;

public class ВозвращениеМинимальногоМаксимальногоЗначения {
    public static void main(String[] args) {
        int a = min(4, 6);
        System.out.println(a);
        int b = max(5, 10);
        System.out.println(b);

    }

    // Метод вычисляет максимум из 2 чисел
    public static int max(int a, int b) {
        return (a > b ? a : b);
    }

    // Метод вычисляет минимум 2 чисел
    public static int min(int a, int b) {

        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

}
