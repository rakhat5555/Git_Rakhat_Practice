package day34_Wrapper_Class;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WarmUpTask {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today.format(dtf));
    }
}
