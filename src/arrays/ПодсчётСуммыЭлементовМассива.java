package arrays;

public class ПодсчётСуммыЭлементовМассива {
    public static void main(String[] args) {
        int[] ints = {10,20,30,40,50,60,70,80,90,100};

        int sum = 0;

        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }

        System.out.println("Sum = " + sum);
    }
}
