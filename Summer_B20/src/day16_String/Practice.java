package day16_String;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        if (word.length() <= 4 ) {
            System.out.println("Too short!");
        } else if (word.length() == 5) {
            StringBuilder input = new StringBuilder();
            input = input.append(word);

            input = input.reverse();
            String result = input.toString();

            System.out.println(result);
        } else {
            System.out.println("Too long!");
        }
    }
}
