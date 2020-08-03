package day9;

public class MidiumNumber {
    public static void main(String[] args) {
        //
        double a = 100, b = 200, c = 300;
        boolean aIsMed = a > b && a < c || a > c && a < b;
        boolean bIsMed = b > a && b < c || b > c && b < a;
        boolean cIsMed = !aIsMed && !bIsMed;
        double med = 0;
        if(aIsMed) { med = a;}
        if(bIsMed) {med = b;}
        if(cIsMed) { med = c;}
        System.out.println(med + " is a medium number");
    }
}
