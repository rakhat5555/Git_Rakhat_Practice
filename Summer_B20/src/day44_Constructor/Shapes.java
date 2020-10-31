package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Shapes {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(6);
        Circle circle3 = new Circle(7);
        Circle circle4 = new Circle(8);
        Circle circle5 = new Circle(9);

         circles.addAll(Arrays.asList(circle1, circle2, circle3, circle4, circle5));
        double maxArea = Integer.MIN_VALUE;
        double minArea = Integer.MAX_VALUE;
        for (Circle each : circles) {
            if(each.area() > maxArea) {
                maxArea = each.area();
            }
            if(each.area() < minArea) {
                minArea = each.area();
            }
        }
        System.out.println("Max area in circle is: "  + maxArea);
        System.out.println("Min Area: " + minArea);
    }
}
