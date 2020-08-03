package day34_Wrapper_Class;

import java.util.Arrays;

public class replPractice {
    public static void main(String[] args) {
        int result1 = max(1,10);
        System.out.println(result1);

    }
    public static int max(int x,int  max)
    {
        int result = 0;
        if(x > max) {
            result = max;
        } else {
            result = x;
        }
        return result;
    }
}
