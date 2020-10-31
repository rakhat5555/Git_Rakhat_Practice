package day41_toString;

public class Developer {
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
    public void coding() {
        System.out.println(name + " is coding");
    }
    public void fixingBug() {
        System.out.println(name + " is crying");
    }
    public String toString() {
        return "Name: " + name + ", Gender: " + gender + ", Age: " + age  + ", Salary: " + salary;
    }

}

class DeveloperObject{
    public static void main(String[] args) {
        Developer[] developers = {new Developer(), new Developer(), new Developer(), new Developer(), new Developer(), new Developer() } ;
        developers[0].setInfo("Rakhat", 125000, "Female", 25);
        developers[1].setInfo("Hamid",110000,"Male",20);
        developers[2].setInfo("AliKemal",125000,"Male",25);
        developers[3].setInfo("Sofiya",110000,"Female",26);
        developers[4].setInfo("Aydan",112500,"Femal",33);
        developers[5].setInfo("Ayse",117500,"Female",29);

//        for (Developer each : developers ) {
//            each.coding();
//        }
        for(int i = 0; i < developers.length; i++) {
            developers[i].coding();
        }
    }
}
