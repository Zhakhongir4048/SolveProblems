package statics;

public class ИспользованиеВМетодеСтатическуюПеременную {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple1 = new Apple();
        apple1.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);

    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applesPrice = Apple.applesPrice + applesPrice;
        }
    }
}

