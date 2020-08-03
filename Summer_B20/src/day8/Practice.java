package day8;

public class Practice {
    public static void main(String[] args) {
        String firstName = "Rakhat", lastName = "Tutueva", citizenShip = "USA";
        String fullName = firstName + " " + lastName;
        int age = 15;
        boolean isTrue = age >= 18 && citizenShip == "USA";
        System.out.println(fullName + " is eligible to vote: " + isTrue );
    }
}
