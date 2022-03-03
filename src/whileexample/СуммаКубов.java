package whileexample;

public class СуммаКубов {
    // Вычисление суммы кубов натуральных чисел, у которых квадрат меньше их количества
    public static void main(String[] args) {
        int sum = 0;                     // итоговая сумма
        int d = 0;                       // стартовое число ряда
        int count = 20;                  // количество чисел
        while (d <= 20) {
            d++;
            if (d * d <= count)
                continue;
            // переходим к следующему числу в цикле
            sum += d * d * d;            // иначе считаем сумму кубок
        } // sum += d * d * d - форма записи, аналогичная sum = sum + d * d * d
        System.out.println(sum);    // печатаем результат

    }
}

