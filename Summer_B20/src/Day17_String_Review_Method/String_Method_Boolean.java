package Day17_String_Review_Method;

import jdk.swing.interop.SwingInterOpUtils;

public class String_Method_Boolean {
    public static void main(String[] args) {
        // String methods: equals, equalsIgnorecase, isEmpty, ends, starts, contains
        String s1 = "Cat"; // String pool
        String s2 = new String ("Cat"); // heap
        String s3 = new String("Cat");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2));  // true
        System.out.println(s2 == s3); // false. new object is created
        System.out.println(s2.equals(s3)); // true

        String s4 = "Java";
        String s5 = "javA";
        System.out.println(s4.equalsIgnoreCase(s5)); // true

        String str = " ";
        System.out.println(str.isEmpty()); //false
        str = str.trim(); // "",
        System.out.println(str.isEmpty()); // true


        // contain method check if it is include it or not

        String str3 = "Java, C#, Python, Ruby, c++";
        System.out.println(str3.contains("Java")); // true
        System.out.println(str3.contains("c++")); // true
        System.out.println(str3.contains("java")); // false
        System.out.println(str.toLowerCase().contains("java")); // true

        String str4 = "ABCD";
        System.out.println(str4.contains("D")); // true

        // startsWith and endsWith

        String str5 = "Cybertek";
        System.out.println(str5.startsWith("C"));
        System.out.println(str5.endsWith("k"));




    }
}
