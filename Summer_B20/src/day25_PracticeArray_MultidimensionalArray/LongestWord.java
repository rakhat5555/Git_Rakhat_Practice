package day25_PracticeArray_MultidimensionalArray;

public class LongestWord {
    public static void main(String[] args) {
        String[] arr = {"Nickolas","Anam",  "Amir", "Nurmamet"};
        int maxLength = arr[0].length(); // 4
        for (String each : arr) {  // to find a max length
            if(each.length()> maxLength) {
                maxLength = each.length();
            }
        }
        for (String each : arr) {
            if (each.length() == maxLength) {
                System.out.println(each);
            }
        }
    }
}
