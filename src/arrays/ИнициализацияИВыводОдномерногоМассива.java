package arrays;

public class ИнициализацияИВыводОдномерногоМассива {


    public static void main(String[] args) {
        int[] q = new int[20];
        for (int i = 0; i < q.length; i++)
            q[i] = i * 5;

        for (int j = 0; j < q.length; j++)
            System.out.println(q[j]);


    }
}
