package operatorreturn;

public class ПроверкаReturnИЗаполнениеЧастиМассива {
    public static void fill(int[] data, int from, int to, int value)
    {
        if (from < 0 || to > data.length)
            return;

        for (int i = from; i < to; i++)
        {
            data[i] = value;
        }
    }

    public static void main(String[] args)
    {
        int[] months = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};
        fill(months, -1, 10, 8);
        printArray(months);
    }

    public static void printArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
