package operatorreturn;

public class ВозвращениеДублированнойСтрокиNРаз {
    // Метод дублирует переданную в него строку n раз
    public static String multiple(String str, int times)
    {
        String result = "";

        for (int i = 0; i < times; i++)
            result = result + str;
        return result;


    }


    public static void main(String[] args) {
        String result = multiple("Hello", 10);
        System.out.print(result);
    }
}
