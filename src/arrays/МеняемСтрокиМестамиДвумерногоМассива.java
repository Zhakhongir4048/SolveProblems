package arrays;

public class МеняемСтрокиМестамиДвумерногоМассива {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}
        };



        int[] temp = matrix[0];    // здесь первая строка массива полностью , также можем ко второй обратиться int[] a = matrix[1];
        matrix[0] = matrix[1];
        matrix[1] = temp;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       /* В matrix[0] у нас хранится ссылка на первую строку.
                Меняем ссылки местами.

        В итоге массив matrix выглядит так:
        {
            {5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5}
        };                     */

    }
}
