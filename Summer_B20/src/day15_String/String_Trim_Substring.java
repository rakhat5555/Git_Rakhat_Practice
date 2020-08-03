package day15_String;

public class String_Trim_Substring {
    public static void main(String[] args) {
        String name = "      Cybertek School      ";
        name = name.trim(); // removes beginning and end


        // substring (beg index, end index and last index is not exluded)

        String sentence = "Java is fun";
        // index numbers   0123456789..
        String word = sentence.substring(0 , 4);
        String word2 = sentence.substring(8 , 11);
        System.out.println(word2);
        String sentence2 = "I like Movies and TV Series";
        //                  01234567891123456789
        String word3 = sentence2.substring(7, 13); // returns Movies
        System.out.println(word3);


        System.out.println("========================================");

        String firstName = "mUHtAR"; // needs to return Muhtar
        String fistCharakter = firstName.substring(0 , 1);
        String rest = firstName.substring(1, firstName.length());
        firstName = fistCharakter.toUpperCase() + rest.toLowerCase();
        System.out.println(firstName);
        String lastName = "tuTuEv";
        String firstChar = lastName.substring(0,1);
        String restLast = lastName.substring(1);// will print until the end
        lastName = firstChar.toUpperCase() + restLast.toLowerCase();
        System.out.println(lastName);

        String s2 = "I like Java Programming Language";
        String language = s2.substring(7);
        System.out.println(language);

    }
}
