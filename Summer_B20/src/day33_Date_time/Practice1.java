package day33_Date_time;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {
        String[] students = {"Rakhat", "Belek" , "Amina", "Eric"};
        LocalDate[] birthDays = {
                LocalDate.of(1992, 04,25),
                LocalDate.of(1989, 10,8),
                LocalDate.of(2017, 4,11),
                LocalDate.of(2015, 1,11)
        };
        for(int i = 0; i <= students.length-1; i ++) {
            System.out.println(students[i] + " : " + birthDays[i] );
        }
        System.out.println("===============");
        for(LocalDate each : birthDays) {
            if(!each.isLeapYear()) {
                continue;
            } else {
                System.out.println(each);
            }
        }
    }
}
