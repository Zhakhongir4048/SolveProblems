package systemoutprinln;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ВыводСтрокиСВводомСтрокИЧисел {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(bufferedReader.readLine());

        String name = bufferedReader.readLine();

        System.out.println("Моё имя " + name + ",мне " + age + " лет");
    }
}