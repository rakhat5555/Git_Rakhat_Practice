package Day24_Arrays;

public class For_Each_Loop {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,-1,-2,-3};
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("=================");

        for(int each: arr) { // each represents the elements
            System.out.print(each + " ");
        }
    }
}
