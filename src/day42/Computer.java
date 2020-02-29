package day42;

public class Computer {

    // attributes
    private String brand;
    private int ram;
    private double price;

    public void runProgram() {
        System.out.println(this.brand + " is running program with the ram size " + ram);
    }

    public void calculate() {
        System.out.println(brand + " is calculating");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        // valid ram is 1-128
        if (ram >= 1 || ram <= 128) {
            this.ram = ram;
        }else {
            System.out.println("INVALID RAM SIZE");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 20) {
            this.price = price;
        }else {
            System.out.println("INVALID PRICE");
        }
    }

    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
