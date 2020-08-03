package day36_Array_List;

import java.nio.channels.SelectableChannel;
import java.util.ArrayList;
import java.util.Collections;

public class Collection_Practice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(15);
        Collections.sort(numbers);
        ArrayList<Integer> descOrder = new ArrayList<>();
        for (int i = numbers.size()-1; i >= 0; i--) {
            descOrder.add(numbers.get(i));
        }
        System.out.println(descOrder);
        System.out.println("===================");
        // swap method
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        Collections.swap(list2, 0, list2.size()-1);
        System.out.println(list2);

        System.out.println("===================");
        // frequency
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('a');
        charList.add('b');
        charList.add('a');
        charList.add('a');
        charList.add('a');
        charList.add('c');

        int result = Collections.frequency(charList, 'b');
        System.out.println(result);


    }
}
