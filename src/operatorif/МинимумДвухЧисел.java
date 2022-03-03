package operatorif;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class МинимумДвухЧисел {
    public static void main(String[] args)  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int number1 = Integer.parseInt(reader.readLine());


        int min;
       if (number < number1){
           min = number;
       } else {
           min = number1;
       }

        System.out.println(min);
    }
}
