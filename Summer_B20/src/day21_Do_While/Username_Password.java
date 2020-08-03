package day21_Do_While;

import java.util.Scanner;

public class Username_Password {
    public static void main(String[] args) {
        String userNameInput = "", passwordInput = "", userName = "user01", password = "123456";
        int count = 1;
        boolean isTrue = true;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Username:");
            userNameInput = scan.next();
            System.out.println("Password:");
            passwordInput = scan.next();
                if(userName.equals(userNameInput) && passwordInput.equals(password)) {
                    isTrue = false;
                    System.out.println("Logged in");
                    System.exit(0);
                }
            count++;

                if (count > 3) {
                    System.out.println("Invalid password or username. Reset password");
                    System.exit(0);
                }
        }while(isTrue);
    }
}
