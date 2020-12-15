package AbstractShapes;

public class Rectangle extends Shape {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateArea() {
        return sideA * sideB;
    }
}