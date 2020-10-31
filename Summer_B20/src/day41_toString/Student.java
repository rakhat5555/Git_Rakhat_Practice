package day41_toString;

public class Student {
    String name;
    int age;
    int groupNumber;
    char gender;
    static String SchoolName = "Cybertek School";
    static String favoriteTeacher = "Muhtar";

    public void setInfo(String name, int age, int groupNumber, char gender){
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }

    public String toString() { // instance method // it belongs to Object
        return "Name: " + name + "\nAge: " + age + "\nGroup Number: " + groupNumber + "\nGender: " + gender + "\nSchool Name: " + SchoolName + "\nFavorite Teacher: " + favoriteTeacher;
    //                   instance var        instance                    instance                                                   static var
    }
}
