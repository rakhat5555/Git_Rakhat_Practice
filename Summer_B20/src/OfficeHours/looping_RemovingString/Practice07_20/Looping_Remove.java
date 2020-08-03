package OfficeHours.looping_RemovingString.Practice07_20;

public class Looping_Remove {
    public static void main(String[] args) {
        String str = "catcat";
        //            01234567

        //substring(0, 4) ==> java
        // substring(1, 5) ==> avaj
        // substring(2, 6) ==> vaja
        // substring(3, 7) ==> ajav
        // substring(4, 8) ==> java

        //substring(i, i+4)

        //"java"
        int count = 0;
        while(str.contains("cat")) {
            count++;
            str = str.replaceFirst("cat", "");
        }
        System.out.println(str);
    }
}
