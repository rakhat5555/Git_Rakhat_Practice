package day34_Wrapper_Class;
import java.util.ArrayList;
public class List_Intrp {
    public static void main(String[] args) {
        ArrayList <Integer>  score = new ArrayList<Integer>();
        score.add(95); // autoBoxing index 0
        score.add(100); // index 1
        score.add(191); // index 2
        score.add(1, 65);
        System.out.println( score.get(2) );

    }
}
