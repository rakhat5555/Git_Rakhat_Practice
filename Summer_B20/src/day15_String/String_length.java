package day15_String;

public class String_length {
    public static void main(String[] args) {
        // length() => returns as a int
        String name = "Cybertek School";
        int nameLength = name.length();
        System.out.println(nameLength);
        int lastIndexNumber = name.length() - 1;
        System.out.println(lastIndexNumber);
        char lastChar = name.charAt(lastIndexNumber);
        System.out.println(lastChar);
    }
}
