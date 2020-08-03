package day29_CustomMethods;

public class UniqueElements_Method {
    public static void main(String[] args) {

        String[] arr = {"A" , "B", "B", "C"};
        unique(arr);
        System.out.println("Hello");
    }
    public static void unique(String[] arr) {
        for (String a : arr ) { // gets each of the element
            int count  = 0;
            for ( String each :arr) {  // gets the frequency of the element
                if( a.equalsIgnoreCase(each)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(a + " ");
            }

        }
        System.out.println();
    }
}
