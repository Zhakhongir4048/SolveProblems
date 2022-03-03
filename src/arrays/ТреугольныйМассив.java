package arrays;

public class ТреугольныйМассив {

        public static int[][] result = new int[10][];

        public static void main(String[] args) {
            result[0] = new int[1];
            result[1] = new int[2];
            result[2] = new int[3];
            result[3] = new int[4];
            result[4] = new int[5];
            result[5] = new int[6];
            result[6] = new int[7];
            result[7] = new int[8];
            result[8] = new int[9];
            result[9] = new int[10];

            for (int a = 0; a < result.length; a++) {
                for (int s = 0; s < result[a].length; s++) {
                    result[a][s] = a + s;
                    if (result[a][s] < 10) {
                        System.out.print(result[a][s] + "  ");
                    } else {
                        System.out.print(result[a][s] + " " );
                    }
                }
                System.out.println();

            }

        }
    }
