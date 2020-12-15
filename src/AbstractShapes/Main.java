package AbstractShapes;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println("Circle area: " + c.calculateArea());

        Rectangle r = new Rectangle(10, 20);
        System.out.println("Rectangle area: " + r.calculateArea());
    }
}
