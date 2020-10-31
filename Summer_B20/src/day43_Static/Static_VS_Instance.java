package day43_Static;

public class Static_VS_Instance {
    static int staticVariable;  //1 copy
    int instanceVariable;     // 2 copy

    public static void main(String[] args) {

        Static_VS_Instance obj1 = new Static_VS_Instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;
        Static_VS_Instance obj2 = new Static_VS_Instance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 300;

        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);

        System.out.println("=================================");
        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);


        System.out.println(  Static_VS_Instance.staticVariable) ; //prefer
    }
}
