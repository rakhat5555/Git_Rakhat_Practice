package day31_Recap_void_dataType;
import Library.Util;

public class CountChar {
    public static void main(String[] args) {
        String str = "AAABBCDDUOOO";

        String expectedResult = "";
        String noDupl =  Util.removeDup(str);

        for(char ch : noDupl.toCharArray()) {
            int count = Util.frequency(str, ch);
            expectedResult += "" + ch + count + " ";
        }


        System.out.println(expectedResult);
        System.out.println("========================");

        String str2 = "wwweeeerrrrrtttttyyyyyyuuuuuuu";
        String expectedResult2 = frequencyOfChars(str2);
        System.out.println(expectedResult2);

    }
    public static String frequencyOfChars(String str) {
        String expectedResult = "";
        String noDupl =  Util.removeDup(str);

        for(char ch : noDupl.toCharArray()) {
            int count = Util.frequency(str, ch);
            expectedResult += "" + ch + count + " ";
        }
        return expectedResult;
    }
}
