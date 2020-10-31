package OfficeHours.looping_RemovingString.Pizza;
/*

 */
public class Pizza {
    String size;
    int numOfCheeseTopping;
    int numOfPepperoni;

    public void setPizzaInfo(String size, int numOfCheeseTopping, int numOfPepperoni){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfPepperoni = numOfPepperoni;
    }

    public double calcPrice() {
        int totalNumberOfTopping  = numOfPepperoni+ numOfCheeseTopping;
        double totalPriceOfTopping = totalNumberOfTopping * 2;
        double totalPrice = totalPriceOfTopping;

        if(size.equalsIgnoreCase("Small")) {
            totalPrice += 10;
        } else if(size.equalsIgnoreCase("Medium") ) {
            totalPrice += 12;
        } else {
            totalPrice += 14;
        }
        return totalPrice;
    }
    public  String toString() {
        return "Size: " + size + "\nQuantity of Cheese Topping: " + numOfCheeseTopping
                + "\nQuantity of Pepperoni Topping: " + numOfPepperoni
                + "\nTotal cost: $" + calcPrice();
    }
}
