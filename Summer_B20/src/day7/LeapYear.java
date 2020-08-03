package day7;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1400;
            boolean result = year % 4 == 0 || year % 100 == 0 || year % 400 == 0;
        System.out.println("Year " + year + " is a leap year: " + result);

    }
}
