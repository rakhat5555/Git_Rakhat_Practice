package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
//import static day44_Constructor.HumanResource.*;
/*
   3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee name and salary

 */
public class BankOfAzerbaijan {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.addAll(Arrays.asList(HumanResource.employee1, HumanResource.employee3, HumanResource.employee5) );

        System.out.println("Total Number of employees: " + list.size() );

//        list.addAll(Arrays.asList(employee1, employee3, employee5) );
//                  by using static import we are able  to import the static members, so can call them whithout the class name;
//        list.add( HumanResource.employee1); // add by one
//        list.add(HumanResource.employee3);
//        list.add(HumanResource.employee5);

        System.out.println("===============================");
        for( Employee each : list) {
            System.out.println(each.name + ": " + each.salary ) ;
        }
    }
}
