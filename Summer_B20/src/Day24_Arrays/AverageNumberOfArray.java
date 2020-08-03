package Day24_Arrays;

import java.util.Scanner;

public class AverageNumberOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to enter?");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<=n-1; i++) {
            System.out.println("Enter a number");
            arr[i] = scan.nextInt();

        }
        int sum = 0;
        for(int i = arr.length-1; i >= 0; i-- ) {
            sum += arr[i];
        }
        double average = sum /(double)n;
        System.out.println(average);

    }
}
