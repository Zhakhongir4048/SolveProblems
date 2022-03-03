package ternaryoperator;

public class ПримерИспользования {
    public static void main(String[] args) {

        ManAndWoman manAndWoman = new ManAndWoman(20);

        String securityAnswer = (manAndWoman.getAge() >= 18 ? "Всё в порядке, проходите!" : "Этот фильм не подходит для вашего возраста!");

        System.out.println(securityAnswer);

    }
}
class ManAndWoman{
    private int age;

    public ManAndWoman(int age){
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

