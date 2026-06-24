abstract class Shape {
    public abstract double area();
    public abstract double perimeter();

    public abstract String getShapeName();
}

// Circle class
class Circle extends Shape {
    private final double radius; // immutable

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}

// Triangle class
class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        double s = perimeter() / 2; // Heron's formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
}

public class ShapeReport {
    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4, 5),
            new Circle(2.5)
        };

        System.out.println("==============================================");
        System.out.printf("%-12s %-15s %-15s%n",
                "Shape", "Area", "Perimeter");
        System.out.println("==============================================");

        for (Shape shape : shapes) {
            System.out.printf("%-12s %-15.2f %-15.2f%n",
                    shape.getShapeName(),
                    shape.area(),
                    shape.perimeter());
        }

        System.out.println("==============================================");
    }
}