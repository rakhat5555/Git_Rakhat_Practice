package day29_CustomMethods;
/* step1: print hello 5 times
step2: print your school name;
step3: print hello 5 times;
step4: print your name
step5: print hello 5 times
*/
public class HelloWords_Without_Parameter2 {
    /* Access- modifier Sperifiers return-type name() {
    }
     */
    public static void main(String[] args) {
        printHello5X();
        System.out.println("Cybertek");
        printHello5X();
        System.out.println("rakhat");
    }
    public static void printHello5X() {
        for (int i = 10; i >= 6; i--) {
            System.out.println("Hello");
        }
    }
}
