package day20_WhileLoop;

public class BranchingStatement {
    public static void main(String[] args) {
        char ch = 'A';
        while (ch <= 'E') {
            if(ch == 'C') {
                ch++; // add this before continue
                continue; // skips everything even the iterator so we need to add iterator before continue
            }
            System.out.println(ch);
            ch++;
        }
        if(true) {
            System.out.println("Started");
            System.exit(0); // it is exit from the full java system
            System.out.println("done"); // it will not execute

        }
    }
}
