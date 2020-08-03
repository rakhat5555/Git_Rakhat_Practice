package day20_WhileLoop;

public class WhileLooping2 {
    public static void main(String[] args) {
        String name = "Rakhat";
        String reversedName = "";
        int i = 0;
        while ( i <= 5) {
            System.out.println(name);
            i++;
        }
        int j = name.length() -1;
        while (j >= 0) {
            reversedName += name.charAt(j) + "";
            j--;
        }
        System.out.println(reversedName);
    }
}
