package day8;

public class Practice3 {
    public static void main(String[] args) {
//        int b =2, c =2;
//        boolean res = b++ == 2;
//        boolean res1 = ++c ==2;
//        System.out.println("res");
        int c = 5; //6
        boolean r2 = c++ == 6 || c-- == 5 || c == 5;
        // 5 == 6 || 6 == 5 || 5 ==5
        // false || false || true


        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) || (z==false);
        System.out.println(x);


        boolean A = true;
        boolean B = !A;
        boolean C = A != B && A == !B && !A == B; // true
        //

    }
}
