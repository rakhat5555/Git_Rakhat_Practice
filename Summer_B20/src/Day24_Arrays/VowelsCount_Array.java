package Day24_Arrays;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class VowelsCount_Array {
    public static void main(String[] args) {
        String vowels = "AeOUI";
        String sentence = "I LoVE PROGRAMMiNG LANGUAGES.";

        String[] vowelsNew = vowels.split("");
        String[] sentenceNew = sentence.split("");

//        System.out.println(Arrays.toString(vowelsNew));
//        System.out.println(Arrays.toString(sentenceNew));

//        for(int j = 0; j <= vowelsNew.length-1; j++) {
//            String first = vowelsNew[j];
//            int count = 0;
//            for(int i = 0; i <= sentenceNew.length-1; i++) {
//                String each = sentenceNew[i];
//                if(each.equals(first)) {
//                    count++;
//                }
//            }
//            System.out.print(first + "" + count + " ");
//        }
            for(String eachVowels : vowelsNew) {
                int count = 0;
                for( String each : sentenceNew  ) {
                    if(eachVowels.equalsIgnoreCase(each)) {
                        count++;
                    }
                }
                System.out.print(eachVowels + count + " ");
            }



    }
}
