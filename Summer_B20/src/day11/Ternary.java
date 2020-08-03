package day11;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
      String result =   (100%2 == 0) ? "even" : "odd"; // ? - means => if; : -means else;
        System.out.println("============================================");
        int num1 = 10;
        int num2 = 20;
        int max1 = 0;
        if (num1> num2) {
            max1 = num1;
        } else {
            max1 = num2;
        }
        System.out.println(max1);
        int max2 = (num1 > num2) ? num1 : num2;

        int age = 20;
        boolean eligible = false; // temporary false
        eligible = (age > 21) ? true : false;
        System.out.println(eligible);
        System.out.println("======================");

        boolean canVote = false;
        canVote = (age > 18)? true : false;
        System.out.println(canVote);

    }
}
