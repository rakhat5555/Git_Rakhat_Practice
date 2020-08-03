package day33_Date_time;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {2,2,1,3,3};



    }
    public static void uniqueElements(int[] arr) {
        for(int eachElement : arr) {
            int count = 0;

            for(int each : arr) {
                if(eachElement == each) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(eachElement + " ");
            }
        }
        System.out.println();
    }
}
