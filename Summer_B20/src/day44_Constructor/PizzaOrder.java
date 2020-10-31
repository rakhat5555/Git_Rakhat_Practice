package day44_Constructor;

public class PizzaOrder {
    public static void main(String[] args) {
        WarmUpPizza.set("Medium", 1,4);
        WarmUpPizza.calcCost();
        WarmUpPizza totalCost = new WarmUpPizza();
        System.out.println(totalCost);
    }

}
