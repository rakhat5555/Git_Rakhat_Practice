package day33_Date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {
        String[] students = {"Rakhat", "Belek" , "Amina", "Eric"};
        LocalDate[] birthDays = {
                LocalDate.of(1992, 04,25),
                LocalDate.of(1989, 10,8),
                LocalDate.of(2017, 4,11),
                LocalDate.of(2015, 1,11)
        };
        DateTimeFormatter dateFormat  = DateTimeFormatter.ofPattern("MMMM/dd/YY EEEE");
    for(int i = 0; i <= students.length-1; i++) {
        System.out.println( students[i] + " : " + birthDays[i].format(dateFormat));
    }
    }
}
