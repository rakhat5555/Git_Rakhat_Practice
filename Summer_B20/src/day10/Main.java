package day10;

import java.util.*;
class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //Write your code here:

        String result = "";
        if(player > 21) {
            result = "bust";
        } else if (player < house) {
            result = "player loss";
        } else if (player == house) {
            result = "its a tie";
        } else if ( player > house) {
            result = "player wins";
        }
        System.out.println(result);

    }
}