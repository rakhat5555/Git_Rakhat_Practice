package day44_Constructor;

public class WarmUpPizza {
    static String size;
    static int NumOfCheeseTopping;
    static int NumOfPepperoniTopping;



    // actions
    public static void  set(String size1, int NumOfCheeseTopping1, int NumOfPepperoniTopping2) {
       size = size1;
       NumOfCheeseTopping = NumOfCheeseTopping1;
       NumOfPepperoniTopping = NumOfPepperoniTopping2;
    }
    public static double calcCost() {
        double total = 0.0;
        if(size.equals("Small") ) {
            total += 10;
        } else if (size.equals("Medium")) {
            total += 12;
        } else {
            total += 14;
        }
        if(NumOfPepperoniTopping > 0) {
            total += (NumOfCheeseTopping * 2);
        }
        if(NumOfPepperoniTopping > 0) {
           total += (NumOfPepperoniTopping * 2);
        }
        return total;
    }

    public  String toString() {
        return "Size: " + size + "\nQuantity of Cheese Topping: " + NumOfCheeseTopping + "\nQuantity of Pepperoni Topping: " + NumOfPepperoniTopping + "\nTotal cost: $" + calcCost();
    }

     static void main(String[] args) {
        WarmUpPizza.set("Medium", 1,4);
        WarmUpPizza.calcCost();
        WarmUpPizza totalCost = new WarmUpPizza();
        System.out.println(totalCost);
    }

}
