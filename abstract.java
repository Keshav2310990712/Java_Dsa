// Abstract class implementation
// abstract class Shape {
//     abstract double area();
//     void display() {
//         System.out.println("Calculating area...");
//     }
// }
// class Circle extends Shape {
//     double radius;
//     Circle(double radius) {
//         this.radius = radius;
//     }
//     @Override
//     double area() {
//         return Math.PI * radius * radius;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Shape circle = new Circle(5);
//         circle.display();
//         System.out.println("Area of circle: " + circle.area());
//     }
// }
//interface
interface Shape {
    double area();
}
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
