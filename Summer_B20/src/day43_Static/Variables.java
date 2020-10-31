package day43_Static;

public class Variables {

    int d;
    static int s;

    public void  method2() {
        System.out.println(d);
        System.out.println(s);
    }


    public static void main(String[] args) {
//        System.out.println(d); // sttaic OnLY accepts static
        Variables obj = new Variables();
        System.out.println(obj.d);
    }
    public static void mehod1() {
        int a;
        if(true) {
            int b = 20;
        }
//        System.out.println(a);


    }

}
