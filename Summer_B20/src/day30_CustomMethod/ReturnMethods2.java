package day30_CustomMethod;

public class ReturnMethods2 {
    public static void main(String[] args) {
        String name = "Level";
        System.out.println(name.equalsIgnoreCase(revString(name)));
    }
    public static String revString(String str) {
        String result = "";
        for(int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
