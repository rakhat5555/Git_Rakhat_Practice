package day19_ForLoop;

public class ABC_Reverse {
    public static void main(String[] args) {
        for(char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(char i = 'Z'; i >='A'; i--) {
            System.out.print(i + " ");
        }
    }

}
