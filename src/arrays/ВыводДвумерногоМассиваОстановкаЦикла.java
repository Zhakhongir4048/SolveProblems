package arrays;

public class ВыводДвумерногоМассиваОстановкаЦикла {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        System.out.println(myArray.length);   // Вывод длины массива на экран

        int[][] array ={{0,1,2,3,4 },
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7},};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");      // Вывод двумерного массива
            }
            System.out.print('\n');
        }

        String[] arrayString = {"one", "two", "three", "Jeronimo"};
        getFirstPosition(arrayString,"two");
    }

    public  static void getFirstPosition(String[] stringArray, String element)
    {
        for (int i = 0; i < stringArray.length; i++)
        {
            if (stringArray[i].equals(element))         // выводит ячейку где находиться "two" и завершает цикл
            {
                System.out.println(i);
                break;
            }
        }
    }
}
