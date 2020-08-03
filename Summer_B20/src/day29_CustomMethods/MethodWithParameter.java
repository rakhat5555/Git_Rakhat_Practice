package day29_CustomMethods;

public class MethodWithParameter {
    public static void main(String[] args) {
        printHello(3);
    }
    public static void printHello(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
}
