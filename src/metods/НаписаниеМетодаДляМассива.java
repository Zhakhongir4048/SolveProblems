package metods;

public class НаписаниеМетодаДляМассива {
    public static void main(String[] args) {

        int[][] moths = {{31, 28}, {31, 30, 31}, {30, 31, 31}};
        fill(moths,8);
        printArray(moths);
    }


    public static void fill(int[][] data, int value)
    {
        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[i].length; j++)
            {
                data[i][j] = value;
            }
        }
    }

    public static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
