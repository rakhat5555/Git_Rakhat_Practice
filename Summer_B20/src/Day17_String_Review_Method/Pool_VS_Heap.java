package Day17_String_Review_Method;
public class Pool_VS_Heap {
    public static void main(String[] args) {
        String s1 = "Cybertek"; // saves in the String pool
        String s2 = "Cybertek"; //saves in the String pool
        String s3 = new String("Cybertek"); // saves in the heap
        String s4 = new String ("Cybertek"); // in the heap.
        System.out.println(s3== s4); // false. because they creat two different object

    }
}
