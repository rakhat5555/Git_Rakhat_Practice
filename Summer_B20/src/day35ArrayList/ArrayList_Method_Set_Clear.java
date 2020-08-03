package day35ArrayList;

import java.util.ArrayList;

public class ArrayList_Method_Set_Clear {
    public static void main(String[] args) {
        ArrayList<String> family = new ArrayList<>();
        family.add("Rakhat");
        family.add("Belek");
        family.add("Eric");
        family.add("Amina");

        family.set(2, "Son");
        family.set(3, "Daughter");
        System.out.println(family);
        family.clear();
        System.out.println(family);

        System.out.println("======================");
// remove (int index)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);
        System.out.println(list);
// remove element
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        Integer a = 1;
        list2.remove(a);
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Rakhat"); // 0
        list3.add("Belek"); // 1
        list3.add("Eric"); // 2
        list3.add("Amina"); // 3
        list3.add("Apa"); // 4

        list3.remove("Apa");
        System.out.println(list3);

    }
}
