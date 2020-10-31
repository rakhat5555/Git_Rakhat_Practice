package day42_Static;

public class ShapeObject {
    public static void main(String[] args) {
        Circle result = new Circle();
        result.setInfo(25);
        System.out.println(result.calcArea());
        System.out.println(result.calcPerimeter());


        System.out.println(result);
        System.out.println("==============================");
        Circle c2 = new Circle();
        System.out.println(c2);


    }
}
