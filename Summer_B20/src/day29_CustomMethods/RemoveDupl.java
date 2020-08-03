package day29_CustomMethods;

import java.sql.PreparedStatement;

public class RemoveDupl {
    public static void main(String[] args) {
        removeDupl("ABAAABBBABCCCCACB");
    }
    public static void removeDupl(String word) {
        String result = "";
//        for (int i = 0; i <= word.length()-1; i++) {
//            if(!result.contains("" + word.charAt(i))) {
//                result += word.charAt(i) + "";
//            }
//        }
        for(String each: word.split("")) {
            if(!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);
    }
}
