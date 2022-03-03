package classdate;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class СегодняшняяДата {
    public static void main(String[] args) {


        LocalDate date = LocalDate.now();
        DayOfWeek day = date.getDayOfWeek();
        switch (day) {
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case TUESDAY:
                System.out.println("Вторник");
                break;
            case WEDNESDAY:
                System.out.println("Среда");
                break;
            case THURSDAY:
                System.out.println("Четверг");
                break;
            case FRIDAY:
                System.out.println("Пятница");
                break;
            case SATURDAY:
                System.out.println("Суббота");
                break;
            case SUNDAY:
                System.out.println("Воскресенье");
                break;
        }
    }
}
