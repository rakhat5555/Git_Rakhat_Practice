package day29_CustomMethods;

public class AgeCalculator {
    public static void main(String[] args) {
        age(1992, 1990);
    }
    public static void age(int birthYear, int currentYear) {
        if(currentYear < birthYear) {
            System.out.println("Invalid Entry");
        } else{
            int age = currentYear - birthYear;
            System.out.println(age);
        }
    }
}
