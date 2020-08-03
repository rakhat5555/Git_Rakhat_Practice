package day28_Recap;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Practice23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();
        int count = 0;
        String word = str.substring(0, n);
        while(str.contains(word)) {
            count++;
            str = str.replaceFirst(word, "");
        }
        System.out.println(count == n);
    }
}
