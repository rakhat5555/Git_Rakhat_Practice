package day20_WhileLoop;

public class LoopingPractice {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if (i % 3 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
