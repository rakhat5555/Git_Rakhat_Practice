package day41_toString;

public class Testers {
    String name;
    double salary;
    String gender;
    int age;
    public void setInfo(String name, double salary, String gender, int age) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Age: " + age  + ", Salary: " + salary;
    }


}
class testersObject{
    public static void main(String[] args) {
        Testers[] testers = {new Testers(), new Testers(), new Testers() , new Testers(), new Testers()};
        testers[0].setInfo("Belek", 130000, "Male", 30);
        testers[1].setInfo("Rakhat", 130000, "Female", 28);
        testers[2].setInfo("Kalbinur",  155000, "Female",  21);
        testers[3].setInfo("Edward", 110000, "Male", 30);
        testers[4].setInfo("Aalia",150000,"Female",18);

        for(Testers each : testers) {
            System.out.println(each);
        }
    }

}