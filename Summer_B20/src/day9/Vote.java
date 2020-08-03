package day9;

public class Vote {
    public static void main(String[] args) {
        boolean citizenship = true;
        int age = 35;
        String result = "";
        if (citizenship == true && age >= 18) {
            result = "Eligible to vote";
        }else {
            result = "Not eligible to vote";
        }
        System.out.println(result);
    }
}
