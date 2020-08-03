package day22_NestedLoop;

public class Nested_LoopShapes {
    public static void main(String[] args) {
        for(int j = 1; j <= 7 ; j++) {
            for(int i = 1; i <= j; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("========================");
        for(int k = 7; k >=1; k--) {
            for(int i = k; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
