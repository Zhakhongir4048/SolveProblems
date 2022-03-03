package keywordthis;

public class ИспользованиеThisВОдномКлассе {
    public static class Cat {
        private String name = "Not name";

        public void setName(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Cat cat = new Cat();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }
}
