package methodsstring;

public class ВозвращаетСимволКоторыйСтоитНаIndexПозицииВСтроке {
    public static void main(String[] args) {
        String string = "Всем привет, сегодня 19 мая";
        char chartAt = string.charAt(5); // Возвращает символ, который стоит на index-позиции в строке
        System.out.println(chartAt);
    }
}
