package day9;

public class Minimum {
    public static void main(String[] args) {
        double a = 100, b = 200, c = 300;
        boolean aIsMin = a < b && a < c;
        boolean bIsMin = !aIsMin && b < c;
        boolean cIsMin = !aIsMin && c < b;
        double min = 0;
        if(aIsMin) {
            min = a;
        } else if (bIsMin) {
            min = b;
        } else if (cIsMin) {
            min = c;
        }
        System.out.println(min + " is the minimum number");
        }
    }

