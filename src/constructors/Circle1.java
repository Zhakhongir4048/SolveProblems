package constructors;

// Вызов конструктора из конструктора
public class Circle1 {

    public double x;
    public double y;
    public double radius;

    public Circle1(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle1(double x, double y) {
        this(x, y, 10);
    }

    public Circle1() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle1 anotherCircle = new Circle1(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }

}

