package day23_Arrays;

public class Looping {
    public static void main(String[] args) {
        String str = "aanmv,vvvvv";
        String noDup = "";
        String result = "";
        for (int i = 0; i<= str.length()-1; i++) {
            String ch = "" + str.charAt(i);
            if(!noDup.contains(ch)) {
                noDup += ch;
            }
        }
        // str = aanmv,vvvvv"  noDup = anmv,
        for(int j = 0; j <= noDup.length()-1; j++) { //iterates the string noDup
            char ch1 = noDup.charAt(j);
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++) { // returns the frequency of each ch from string str
                if(str.charAt(i) == ch1) {
                    count++;
                }
            }
            result += "" + ch1 + count;
        }

        System.out.println(result);
    }
}
