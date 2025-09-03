abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
    double area() { return 3.14 * radius * radius; }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) { base = b; height = h; }
    double area() { return 0.5 * base * height; }
}
class Test2 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Triangle(4, 6);
        System.out.println("Circle area: " + s1.area());
        System.out.println("Triangle area: " + s2.area());
    }
}
