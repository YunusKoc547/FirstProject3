package day43;

import java.util.Collections;

public class Coffee {

    public String type;
    public int caffeineLevel;
    public double price;

    public Coffee() {
        System.out.println("no arg constructor being called");
    }

    public Coffee(String type, int caffeineLevel) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        System.out.println("2 args constructors being called");
    }

    public Coffee(String type, int caffeineLevel, double price) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        if (price > 0) {
            this.price = price;
        }else {
            this.price = 1;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
