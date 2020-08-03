package day34_Wrapper_Class;

public class WrapperClass_Method {
    public static void main(String[] args) {
        String str = "123";
        int a = Integer.parseInt(str); //123
        System.out.println(str + 1);
        System.out.println(a + 1);

        String str1 = "7.5";
        double d = Double.parseDouble(str1);
        System.out.println(d -1);

        String s1 = "TRUE";
      boolean b1 =  Boolean.parseBoolean(s1);
        System.out.println(!b1);
        System.out.println("==================");
        String str2 = "1230000.5";
      Double d2 =  Double.valueOf(str2); // unboxing
        System.out.println(d2 + 2);

        String s3  = "FaLsE";
        boolean b2 =  Boolean.valueOf(s3); // unboxing
    }
}
