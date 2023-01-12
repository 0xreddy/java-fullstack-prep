import java.awt.Color;

public class circle {
    private Color color;
    private double radius;

    public circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void printColorAndArea() {
        System.out.println("Color: " + color);
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        circle circle = new circle(Color.RED, 5);
        circle.printColorAndArea();
    }
}
