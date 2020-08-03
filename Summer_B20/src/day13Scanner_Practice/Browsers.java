package day13Scanner_Practice;

public class Browsers {
    public static void main(String[] args) {
       /* . write a program that can display the selected browser
        1.1  declear a String variable called browserName
        1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
        1.3. if the browser name does not match with the valid browsers' names,
        out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary*/
        String browserName = "firefox";
        switch (browserName) {
            case "Chrome":
                System.out.println("Opening Chrome Browser");
                break;
            case "firefox":
                System.out.println("Opening Firefox");
                break;
            case "opera":
                System.out.println("Opening Opera");
                break;
            case "safari":
                System.out.println("Opening Safari");
                break;
            case "edge":
                System.out.println("Opening Edge");
                break;
            default:
                System.out.println("Invalid Browser Name");
        }
    }
}
