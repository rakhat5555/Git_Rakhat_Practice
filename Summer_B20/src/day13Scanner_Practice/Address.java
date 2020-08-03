package day13Scanner_Practice;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        int buildingNumber, zipCode;
        String streetAddress, cityName, state, fullName;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number:");
        buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your street address:");
        streetAddress = scan.nextLine();
        System.out.println("Enter your city:");
        cityName = scan.nextLine();
        System.out.println("Enter your state:");
        state = scan.next();
        System.out.println("Enter you zip code:");
        zipCode = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your full name:");
        fullName = scan.nextLine();
        scan.close();
//        System.out.println("Ship To: " + fullName);
//        System.out.println("         " + buildingNumber + " " + streetAddress);
//        System.out.println("         " + cityName + ", " + state + " " + zipCode);
        System.out.println("Ship To: "+ fullName + "\n\t\t " + buildingNumber + " " + streetAddress + "\n\t\t " + cityName + ", " + state + " " + zipCode);
    }
}
