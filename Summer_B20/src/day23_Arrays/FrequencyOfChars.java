package day23_Arrays;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "ABAB"; // A2B2
        String nonDub = ""; // AB
        String result = "";  //A2B20
        for (int i = 0; i <= str.length() -1; i++) {
            String ch ="" +  str.charAt(i); // A, B , A ,B
            if(!nonDub.contains(ch)) {
                nonDub += ch;
            }
        }
        System.out.println(nonDub);
        // ABAB  "AB
        for(int j = 0; j<= nonDub.length() -1; j++) {
            char ch = nonDub.charAt(j);
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++) {
                if(str.charAt(i) == ch) {
                    count += 1;
                }
            }
            result += "" + ch + count;
        }


        System.out.println(result);
 }
}
