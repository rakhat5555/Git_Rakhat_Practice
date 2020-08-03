package Day24_Arrays;

public class UniqueWordsInArray {
    public static void main(String[] args) {
        String[] words = {"belek", "belek", "Rakhat", "Rakhat", "life", "amina", "eric", "eric"};

        for(int k = 0; k <= words.length-1; k++) {
            String s = words[k];
            int count = 0;
            for(int i = 0; i <= words.length-1; i++) {
                String each = words[i];
                if(s.equalsIgnoreCase(each)) {
                    count++;
                }

            }
            if(count == 1) {
                System.out.print(s + " ");
            }

        }


    }
}
