package day44_Constructor;

public class Rectangle {
    double length;
    double width;

    public  Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        double areaTotal = 0;
        areaTotal = length * width;
        return areaTotal;
    }
    public double perimeter() {
        double perimeterTotal = 0;
        perimeterTotal = (length *2 ) + (width * 2);
        return perimeterTotal;
    }
    public  String toString() {
        return "Length: " + length + "\nWidth: " + width + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }

}
