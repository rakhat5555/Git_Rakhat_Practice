package day13Scanner_Practice;
import java.util.Scanner;
public class Shopping_list {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item1, item2, item3, report = "";
        double price1, price2, price3, totalPrice;
        int count1, count2, count3;

        System.out.println("Enter Item1, count and its price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();
        price1 *= count1;
        price2 *= count2;
        price3 *= count3;
        if(count1 == 0 && count2 != 0 && count3 != 0) {
            report = "Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3;
            totalPrice = price3 + price2;
        } else if (count2 == 0 && count2 != 1 && count3 != 0) {
            report = "Item1: " + item1 + " Price: " + price1 + ", Item3: " + item3 + " Price: " + price3;
            totalPrice = price3 + price1;
        } else if (count3 == 0 && count2 != 0 && count1 != 0) {
            report ="Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2;
            totalPrice = price1 + price2;
        } else if (count1 == 0 && count2 == 0 && count3 != 0) {
            report = "Item3: " + item3 + " Price: " + price3;
            totalPrice = price3;
        } else if (count1 == 0 && count2 != 0 && count3 == 0) {
            report = "Item2: " + item2 + " Price: " + price2;
            totalPrice = price2;
        } else if (count1 != 0 && count2 == 0 && count3 == 0) {
            report = "Item1: " + item1 + " Price: " + price1;
            totalPrice = price1;
        } else {
            report = "Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3;
            totalPrice = price3 + price2+ price1;
        }
        System.out.println(report + "\nTotal price: "+ totalPrice);
    }
}
