import java.util.Scanner;

// Interface for shapes
interface Shape {
    void readInput();
    double calculateArea();
    void displayArea();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    @Override
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        radius = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of Circle: " + calculateArea());
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    @Override
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        length = scanner.nextDouble();
        System.out.println("Enter width of the rectangle:");
        width = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of Rectangle: " + calculateArea());
    }
}

// Square class implementing Shape interface
class Square implements Shape {
    private double side;

    @Override
    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side length of the square:");
        side = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void displayArea() {
        System.out.println("Area of Square: " + calculateArea());
    }
}

// Main class for testing
public class four {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        // Calculate and display areas
        circle.readInput();
        circle.displayArea();

        rectangle.readInput();
        rectangle.displayArea();

        square.readInput();
        square.displayArea();
    }
}
