package day23_Arrays;

import javax.xml.namespace.QName;

public class Array_Practice {
    public static void main(String[] args) {
        String[] students = {"Muhtar", "Nadir", "Asiya"};
        int[] scores = {85, 70,100};
//        System.out.println(students[0] + scores[0]);
        for(int i = 0; i <= 2; i++) {
            System.out.println(students[i] + " : " + scores[i]);
        }
    }
}
