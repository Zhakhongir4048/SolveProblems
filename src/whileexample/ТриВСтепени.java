package whileexample;


public class ТриВСтепени {
    public static void main(String[] args) {
        int number  = 3; // Возводимое в степень число
        int result  = 1; // Результат возведения в степень
        int power = 1; // Начальный показатель степени

        while (power <=10){
            result = number * result;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }


        int number1 = 3; // число возводимое в степень
        int result1 = number1;    // результ равняется трём 3  результат возведения в степень
        int power1 = 1;         // Начальный показатель степени

        do {
            System.out.println(number1 + " в степени " + power1 + " = " + result1);
            power1++;
            result1 = result1 * number1;     // 3 * 3 = 27 затем 27 * 3 = 81 и т.д

        }     while (result1 < 10000);

    }
}


