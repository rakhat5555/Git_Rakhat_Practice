package day43_Static;

public class StaticBlock2 {
    static int a ;
    static String b;

    static {
        a = 100;
        b = "Cybertek";
    }

    public static void main(String[] args) {
        System.out.println(a + "\n" + b);
    }

}
