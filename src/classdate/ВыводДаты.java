package classdate;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ВыводДаты {
    public static void main(String[] args) {
        SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
