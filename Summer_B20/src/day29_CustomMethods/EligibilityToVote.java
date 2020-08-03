package day29_CustomMethods;


public class EligibilityToVote {
    public static void main(String[] args) {
        vote("John", 28, true, "Biden");
        vote("Daniel", 17, true , "Kanye");
        eligibleToBuyAlcohol(true, 18);
        calculator(100, '-', 20);
    }



    public static void vote(String name, int age, boolean citizen, String canditateName) {
        boolean eligibleToVote = age >= 18 && citizen == true;
        if(eligibleToVote) {
            System.out.println(name + " is eligible to vote for " + canditateName);
        } else {
            System.out.println( name + " is not eligible to vote");
        }
    }
    public static void eligibleToBuyAlcohol(boolean hasID, int age) {
        if(hasID && age >=21) {
            System.out.println("You are eligible to buy a milk");
        } else {
            System.out.println("buy a milk");
        }
    }
    public static void calculator(double num1, char operator, double num2) {
        switch (operator) {
            case'+' :
                System.out.println("Addition: " + (num1 + num2));
                break;
            case'-':
                System.out.println("Substraction: " + (num1 - num2));
                break;
            case'*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case'/':
                System.out.println("Devision: " + (num1 / num2));
                break;
            case'%':
                System.out.println("Reminder: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
