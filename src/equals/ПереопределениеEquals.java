package equals;

public class ПереопределениеEquals {
    public static void main(String[] args) {

        Man man = new Man();
        man.dnaCode = 1111222233;


        Man man1 = new Man();
        man1.dnaCode = 1111222233;


        System.out.println(man.equals(man1));

    }
}

class Man {
    int dnaCode;

    public boolean equals(Man man) {
        return this.dnaCode == man.dnaCode;
    }
}

