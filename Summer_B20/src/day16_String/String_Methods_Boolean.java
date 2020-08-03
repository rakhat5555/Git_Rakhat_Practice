package day16_String;

public class String_Methods_Boolean {
    public static void main(String[] args) {
        // isEmpty();
        String name = "Cybertek";
        System.out.println(name.isEmpty());


        String str1  = "Java"; // saves in the java  string pool
        String str2 = new String("Java"); // saves == in java heap
        System.out.println(str1 == str2); // return false
        System.out.println(str1.equals(str2)); // return true ; it will check only the text;
        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4); // return false; because 2 different object
        System.out.println(str3.equals(str4)); //return true'





    }
}
