package day44_Constructor;

public class Circle {
    double radius;
    double diameter;
    static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = radius* 2;
    }

    public double area() {
        double areaTotal = 0;
        areaTotal = (radius * radius) * pi;
        return  areaTotal;
    }
    public double perimeter() {
        double perimeterTotal = 0;
        perimeterTotal = diameter* pi ;
        return  perimeterTotal;
    }
    public String toString() {
        return  "Radius: " + radius + "\nDiameter: " + diameter + "\nPi: " + pi + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
