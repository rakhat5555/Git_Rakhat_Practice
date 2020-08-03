package day31_Recap_void_dataType;

public class Method_Reverse {
    public static void main(String[] args) {
        String name = "madam";
        String rev = reversed(name);
        System.out.println(rev.equalsIgnoreCase(name));
    }
    public static String reversed(String word){

        String reversedStr = "";

        for(int i = word.length()-1; i>= 0; i--) {
            reversedStr += word.charAt(i);
        }
        return reversedStr;
    }
}
