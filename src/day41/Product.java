package day41;

// Make this Product a well encapsulated
// Make all the instance fields private so it can only accessible in same class
// provide public getters and setters method
public class Product {


    private String name;
    private double price;

    public String getName() {
        return  name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
        }
    }

    public void setName(String newName) {
        name = newName;
    }





}
