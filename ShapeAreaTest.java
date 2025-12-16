import java.util.Scanner;
abstract class Shape {
    int dim1, dim2;
    Shape(int a, int b) {
        dim1 = a;
        dim2 = b;
    }
    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    void printArea() {
        double area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}
class Circle extends Shape {
    Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}
public class ShapeAreaTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = sc.nextInt();
        Rectangle r = new Rectangle(length, breadth);
        r.printArea();
        System.out.print("\nEnter base of Triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        int height = sc.nextInt();
        Triangle t = new Triangle(base, height);
        t.printArea();
        System.out.print("\nEnter radius of Circle: ");
        int radius = sc.nextInt();
        Circle c = new Circle(radius);
        c.printArea();

        sc.close();
    }
}