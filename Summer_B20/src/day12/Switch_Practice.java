package day12;

public class Switch_Practice {
    public static void main(String[] args) {
        int num = 1;
        String result = "";
        switch (num) {
            case 1:
                result = "Monday"; // we can assign to the String
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid value");
        }
    }
}
