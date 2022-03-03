package trueandfalse;

public class БулевыВыражения {
    public static void main(String[] args) {


        boolean result = isALessThanB(3,5);
        System.out.println(result);



        int age = 35;
        if (age >= 18 && age <= 65)                      // Правда и правда
            System.out.println("Вы можете работать");


        int age1 = 35;
        boolean isYoung = (age1 < 18);
        if (!isYoung && age1 <= 65)                          // true && true
            System.out.println("Вы можете работать");

        int age2 = 35;
        boolean isYoung1 = (age2 < 18);
        boolean isOld = (age2 > 65);
        if (!isYoung1 && !isOld)                            // true && true
            System.out.println("Вы можете работать");




    }

    public static boolean isALessThanB (int a, int b)       // Старайся использовать такую запись
    {
        return a < b;
    }
}



