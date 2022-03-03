package classdate;

import java.util.Date;

public class ПримерыИспользования {
    public static void main(String[] args) throws InterruptedException {
        // Получение текущей даты
        Date date = new Date();
        System.out.println("Current date: " + date);

        // Вычисляем разницу между двумя датами
        Date currentTime = new Date();           //получаем текущую дату и время
        Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");

        // Наступило ли уже некоторое время
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;  // +  5 секунд
        Date endDate  = new Date(endTime);

        Thread.sleep(3000);           // ждём 3 секунды

        Date currentTime1 = new Date();
        if (currentTime1.after(endDate)){  //проверяем что время currentTime после endDate
            System.out.println("End time!");
        }


    }
}
