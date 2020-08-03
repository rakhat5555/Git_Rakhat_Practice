package day9;

public class IfStatement {
    public static void main(String[] args) {
        boolean hasID = true;
        int age = 19;
        boolean eligible = hasID && age >= 21;
        String result = "";
        if(eligible == true) {
            result = " Eligible to biu alcohol";
        } else if (eligible == false ) {
            result = "You are not old enough to buy alcohol";
        }
        System.out.println(result);
    }
}
