package day8;

public class ifStatement {
    public static void main(String[] args) {
        int angle1 = 60;
        int angle2 = 120;
        int angle3 = 20;
        boolean isValidTriangle = angle1 + angle2 + angle3 ==180;
        if(isValidTriangle) {
            System.out.println("It is Valid Triangle");
        }else
            System.out.println("It is not Valid Triangle");
    }
}
