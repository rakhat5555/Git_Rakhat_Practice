package Day17_String_Review_Method;

import java.sql.PreparedStatement;

public class String_Methods {
    public static void main(String[] args) {
        String str = "Cybertek";
        //            01234567
        char ch = str.charAt(0);
        System.out.println(ch);
        int l = str.length();
        char ch2 = str.charAt(l - 1); // gives last letter
        System.out.println(ch2);
        String str7 = "I like Java Language";
        //             01234567891123456789;
        String word = str7.substring(7, 11); // to get Java
        System.out.println(word);
        String word1 =  str7.substring(12);
        System.out.println(word1);
        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";
       int i =  str8.indexOf("We");
        System.out.println(i);
        System.out.println(str8.charAt(23));
        int i1 = str8.indexOf((", W") + 2);
        System.out.println(i1);
        System.out.println(str8.charAt(38));
        System.out.println("==============");


        String str9 = "Java Java Java";
         int i4 = str9.lastIndexOf("J");
        System.out.println(i4);
        int i5 = str9.indexOf("J");
        System.out.println(i5);
        int i6 = str9.indexOf(" Java ") + 1;
        System.out.println(i6);

        // replace & replaceFirst
        String s1 = "I like java, java is a programming language";
//        s1 = s1.replace("java", "C#");
        String s2 = s1.replaceFirst("java", "C#");
        System.out.println(s2);

    }
}
