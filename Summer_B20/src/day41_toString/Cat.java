package day41_toString;

public class Cat {
   String name;
   int age;
   char gender;
   String color;
   String breed;

   public void setCatInfo(String name, int age, char gender, String color, String breed) {
       this.name = name;
       this.age = age;
       this.gender = gender;
       this.color = color;
       this.breed = breed;
   }

   public void eat(String catFood) {
       System.out.println(name + " is eating " + catFood);
   }

   public void drink (String drink) {
       System.out.println(name + " is drinking " + drink);
   }

   public String toString() {  //will be executed automatically when the cat object is passed in the print statement
       return "Name: " + name +
               ". Age: " + age + " years old" +
               ". Gender: " + gender +
               ". Color: " + color +
               ". Breed: " + breed;
   }
}
