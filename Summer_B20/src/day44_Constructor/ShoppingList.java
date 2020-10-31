package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1 = new Item("Tomato", 1.99, 2);
        Item item2 = new Item("Banana", 0.69, 3);
        Item item3 = new Item("Grape", 2.99, 3);
        Item item4 = new Item("Onion", 1.25, 2);
        Item item5 = new Item("Apple", 1.85, 4);

        ArrayList<Item> List = new ArrayList<>();
        List.addAll(Arrays.asList(item1, item2, item3, item4, item5) );
        double totalCost = 0;
        for (Item each : List) {
              totalCost += each.calcCost();
        }
        System.out.println(List);
        System.out.println("Total Cost: " + totalCost);
    }
}
