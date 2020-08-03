package Day24_Arrays;

public class UniqueWords_ForEach {
    public static void main(String[] args) {
        String[] words = {"belek", "belek", "Rakhat", "Rakhat", "life", "amina", "eric", "eric"};

        for( String bEach : words) {

            int count = 0;
            for(String each : words) { // each represents each elements in the array
                if(bEach.equals(each)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print( bEach + " ");
            }
        }


    }
}
