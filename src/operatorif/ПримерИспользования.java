package operatorif;

public class ПримерИспользования {
    public static void main(String[] args) {
        Woman woman = new Woman(22);

        String securityAnswer;

        if (woman.getAge() >= 18) {
            securityAnswer = "Всё в порядке, проходите!";
        } else {
            securityAnswer = "Этот фильм не подходит для вашего возраста";
        }

        System.out.println(securityAnswer);
    }

}

class Woman {
    private int age;

    public Woman(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
