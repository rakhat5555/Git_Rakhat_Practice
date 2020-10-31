package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class catObjects2 {
    public static void main(String[] args) {

        Cat [] catPark = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat() };


        catPark[0].setCatInfo("Cass", 2, 'F', "grey", "seamise");
        catPark[2].setCatInfo("Nisha",3,'F',"White","Siamese");
        catPark[3].setCatInfo("Laika",2,'M',"brown","Bengal Cat");
        catPark[4].setCatInfo("Zaika",6,'F',"Purple","Ragdoll");
        catPark[1].setCatInfo("Boika",7,'M',"Green","Maine Coon");


        ArrayList<Cat> femaleCats = new ArrayList<>();
        ArrayList<Cat> maleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(catPark));
        femaleCats.removeIf(p -> p.gender == 'M');
        maleCats.addAll(Arrays.asList(catPark));
        maleCats.removeAll(femaleCats);
        System.out.println("Number of female cats: " + femaleCats.size());
        System.out.println("Number of male cats: " + maleCats.size());


        System.out.println("=============================================");
    }
}
