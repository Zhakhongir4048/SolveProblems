package stringpool;

public class ПримерИспользования {
    public static void main(String[] args) {
         String a = "привет";
         String b = "привет";
         String c = "пока";


         // Работа со стринг пулл
         String[] pool  = {"привет", "пока"};

         a = pool[0];
         b = pool[0];
         c = pool[1];

    // а и b будут хранить одинаковые ссылки



    }
}
