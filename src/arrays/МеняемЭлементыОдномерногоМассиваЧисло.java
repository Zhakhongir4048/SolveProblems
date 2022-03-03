package arrays;

public class МеняемЭлементыОдномерногоМассиваЧисло {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 2, 1, 4, 1, 2, 3, 10, 13, 12};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }


        System.out.println();


        int b = a.length;
        int temp;

        for (int i = 0; i < b / 2; i++) {
            temp = a[b - i - 1];
            a[b-i-1] = a[i];
            a[i] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
