package day31_Recap_void_dataType;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "aabcccddddkkkklj";
        String uniques = "";
        for( char each: str.toCharArray()) {
            int count = frequency(str, each);
            if(count ==1) {
                uniques += each;
            }
        }

        System.out.println(uniques);
        System.out.println("===================");
        String str2 = "ppppoiiiiuuuuuyyyyttttr";
        String uniques2 = uniques(str2);
        System.out.println(uniques2);
    }

    public static int frequency(String str, char ch) {
        int count = 0;
        for(char each : str.toCharArray() ) {
            if(each == ch) {
                count++;
            }
        }
        return count;
    }

    public static String uniques( String str) {
        String uniques = "";
        for( char each: str.toCharArray()) {
            int count = frequency(str, each);
            if(count ==1) {
                uniques += each;
            }
        }
        return uniques;
    }
}
