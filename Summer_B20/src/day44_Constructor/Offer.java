package day44_Constructor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;

    public Offer(String location, String company, double salary, boolean isFullTime) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }
    public String toString () {
        return "Location: " + location + "\nCompany: " + company +"\nSalary: " + salary + "\nFull Time: "+ isFullTime;
    }
}

class MyOffers {
    public static void main(String[] args) {


        Offer offer1 = new Offer("California", "Apple", 125000, true);
        Offer offer2 = new Offer("Oregon", "Intel", 105000, true);
        Offer offer3 = new Offer("Oregon", "Amazon", 130000, false);
        Offer offer4 = new Offer("Oregon", "Chase", 110000, true);
        Offer offer5 = new Offer("Oregon", "BankOfAmerica", 95000, false);

        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5) );

        for(Offer each : offers) {
            if(each.isFullTime == true && each.salary > 100000 && each.location.equals("Oregon")) {
                System.out.println(each);
                System.out.println("==============");
            }

        }

        Carpet carpet1 = new Carpet(3.5, 5.5, 50, true);
        System.out.println(carpet1);
    }
}
