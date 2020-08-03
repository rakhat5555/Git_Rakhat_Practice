package day32;
import Library.Util;

public class MethodCalls {
    public static void main(String[] args) {
        String firstName = "rAkhaT";
        String lastName = "tUTueVa";
        String fullName = Util.formatFullName(firstName, lastName);
        System.out.println(fullName);
        String countChars = Util.frequencyOfChars(fullName.toLowerCase());
        System.out.println(countChars);
        String reversed = Util.reverse(fullName);
        System.out.println(reversed);
    }
}
