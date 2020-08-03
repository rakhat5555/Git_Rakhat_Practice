package day25_PracticeArray_MultidimensionalArray;

public class Practice {
    public static void main(String[] args) {
        String str = "OOPQQ";
        String noDupl = "";

        for (int i = 0; i <= str.length() -1; i++) {
            String s = str.charAt(i)+ "";
            if( !noDupl.contains(s) ) {
                noDupl += s;
            }
        }
        String result = "";
        for(int k = 0; k <= noDupl.length()-1; k++) {
            int count = 0;
            char ch1 = noDupl.charAt(k);
            for(int i = 0; i <= str.length()-1; i++ ) {
                char each = str.charAt(i);
                if (ch1== each ) {
                    count++;
                }
            }
            if(count == 1) { // without this if statement it will count every letter in the str.
                result +=""+ ch1 + count + " " ;
            }

            
        }


        System.out.println(result);
    }
}
