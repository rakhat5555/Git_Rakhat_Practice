package Day24_Arrays;

public class UniqueNumbers_forEach {
    public static void main(String[] args) {
        int[] numbers = {1,1,2,3,3,4,5,5,6};

        for(int a : numbers) {

            int count = 0;
            for (int b: numbers) {
                if(b == a) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(a + " ");
            }
        }
    }
}
