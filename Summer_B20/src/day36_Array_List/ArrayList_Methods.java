package day36_Array_List;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // 0
        list.add(20); // index 1
        list.add(30); // 2
        list.add(40); // 3
        list.add(50); //4
        list.add(40); // 5
        int a = list.indexOf(40); // return 3 index of 40;
        int b = list.lastIndexOf(40); // returns 5
        System.out.println(a);

        // contains method return boolean
       boolean r1 =  list.contains(100);
        System.out.println(r1);

    }
}
