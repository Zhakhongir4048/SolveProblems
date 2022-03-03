package castingofprimitivetypes;

public class ПреобразованиеКТипуString {
    public static void main(String[] args) {
        int x = 5;
        String text = "X=" + x;
        System.out.println(text);


        Cater cater = new Cater("Vaska");
        String text1 = "My cat is " + cater;
        System.out.println(text1);


        Object o = null;
        String text3 = "Object is " + o;
        System.out.println(text3);


        String text4 = 5 +  (int) '\uA904' + "Log";
        System.out.println(text4);


        String text5 = "Object is " + (float) 2 / 3;
        System.out.println(text5);

    }
}
class Cater{
    String name;

    public Cater(String name){
        this.name = name;
    }
}

