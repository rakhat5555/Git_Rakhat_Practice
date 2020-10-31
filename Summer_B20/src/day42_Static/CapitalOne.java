package day42_Static;

public class CapitalOne {
    public static void main(String[] args) {
        Tester[] testers = {new Tester(), new Tester(), new Tester() };
        testers[0].setInfo("Rakhat", 'F', 15111L,"Lead Tester",180000);
        testers[1].setInfo("Naz",'F',15222L,"Tester", 170000);
        testers[2].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);

        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer() };
        developers[0].setInfo("Waqar", 'M', 2111L, "Dev Lead" , 150699);
        developers[1].setInfo("Rakhat", 'F', 3222L, "Dev", 123000);
        developers[2].setInfo("Burak", 'M', 43333L, "Dev", 124555);
        developers[3].setInfo("Akbar", 'M', 0005L, "Dev", 120000);
        developers[4].setInfo("Eric", 'M', 0455L, "Dev", 110000);



        ScrumTeam team1 = new ScrumTeam();
        team1.setInfo("Belek", "Eric", "Amina");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);
        System.out.println("==================================================================");

        for(Tester each : team1.testers) {
            System.out.println(each.name + ": $" +  each.salary);
        }
        System.out.println("=====================================================================");
        System.out.println("Developers: ");
        for(Developer each : team1.developers) {
            System.out.println(each.name + ": $" + each.salary);
        }

        System.out.println("=========================================================================");
        team1.removeTester(15333L);
        team1.removeDeveloper(0005L);

        System.out.println(team1);

        double max = Integer.MIN_VALUE;
        String name = "";
        for( Tester each : team1.testers) {
            if(max < each.salary ) {
                max = each.salary;
                name = each.name;
            }
        }
        System.out.println("Max salary from testers is: " + name + " " + max);
    }
}
