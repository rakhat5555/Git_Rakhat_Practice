package day44_Constructor;

import day41_toString.Car;

public class Carpet {
    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length= length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        double totalCost = 0;
        totalCost = (width + length) * unitPrice;
        if(isPersian == true) {
            totalCost += 200;
        }
        return  totalCost;
    }

    public String toString() {
        return "Width: " + width + "\nLength: "+ length + "\nUnit Price: " + unitPrice + "\nPersian: " + isPersian + "\nTotal Cost: $" + calcCost();
    }
}
