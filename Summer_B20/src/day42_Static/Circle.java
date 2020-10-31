package day42_Static;

public class Circle {
    double radius;
    double diameter;
    static double pi = 3.14;

    public void setInfo(double radius) {
        this.radius = radius;
        diameter = radius* 2;
    }
    public double calcArea() {
        return radius* radius * pi;
    }
    public double calcPerimeter(){
        return diameter * pi;
    }

    public String toString (){
//        return "The are of the circle with the radius of: " + radius + " is: " + calcArea();
    return "Radius: " + radius + "\nDiameter: " + diameter + "\nPI: " + pi + "\nArea: " + calcArea() + "\nPerimeter: " + calcPerimeter();
    }
}
