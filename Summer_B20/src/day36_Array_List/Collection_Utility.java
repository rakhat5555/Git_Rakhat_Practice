package day36_Array_List;
import java.util.ArrayList;
import  java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {
        //Arrays: utility callss for arrays
        // Collections: utility for collection
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(21);
        list.add(14);
        list.add(5);
        list.add(35);
        Collections.sort(list);
        System.out.println("Maximum number: " + list.get(list.size()-1) );
        System.out.println("Minimum number: " + list.get(0));
    }
}
