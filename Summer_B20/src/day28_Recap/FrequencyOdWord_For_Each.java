package day28_Recap;

public class FrequencyOdWord_For_Each {
    public static void main(String[] args) {
        String str = "breadjambread";
        int count = 0;
        for(int i = 0; i <= str.length()-5; i++) {
            String s = str.substring(i, i + 5);
            if(s.equals("bread")) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println("Works");
        }
    }
}
