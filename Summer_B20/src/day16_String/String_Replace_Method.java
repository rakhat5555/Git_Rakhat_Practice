package day16_String;

public class String_Replace_Method {
    public static void main(String[] args) {
        String email = "Cybertek@gmail.com";
         email = email.replace("gmail" , "yahoo");
        System.out.println(email);
        String word = "Java";
         word = word.replace("a", "e");
        System.out.println(word);
        String sentence = "I like to learn Java, Java is cool, Java is fun";
       sentence = sentence.replace("a, Java", "a, C#");
        sentence = sentence.replace("Java ", "Python ");
        System.out.println(sentence);
        String s5 = "I like to stay in cybertek, we are learning java";
        int r1 = s5.indexOf("r");
        int r2 = s5.indexOf("re"); // returns the first char 'r' index
        System.out.println(s5.charAt(r1));


        // lastIndexOf()
        String s6 = "Java is a programming language, and Java is fun";
        int i1 = s6.lastIndexOf("J");
        String s8 = "Java";
        int a = s8.indexOf("a"); // if you assign double you can't use this double a . because index is int
        char ch = s8.charAt(a);
    }
}
