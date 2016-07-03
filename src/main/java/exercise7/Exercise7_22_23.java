package exercise7;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise7_22_23 {

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합:" + sumArea(arr));
    }

    static double sumArea(Shape[] arr) {
        double sumArea = 0.0;
        for (Shape shape : arr) {
            sumArea += shape.calcArea();
        }
        return sumArea;
    }
}


abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}


class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}


class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    double calcArea() {
        return r * r * Math.PI;
    }
}


class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {
        return width == height;
    }

    double calcArea() {
        return width * height;
    }

}