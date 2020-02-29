package day39;

public class Car {

    // year, model, make, color
    int year;
    String model;
    String make;
    String color;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.year = 2020;

        car1.printAge();
    }
    // or in one shot
    // String model, make, color

    // instance methods are tied to the object
    // it does not have static keyword
    // we need an object when we call them
    public void goForward() {
        System.out.println(make + " Going forward");
    }

    // Create a method to print how old is this car
    public void printAge() {
        System.out.println("car age : " + (2020 - year));
    }

    // Create a method to change the color
    public void changeColorTo(String newColor) {
        // Write bunch of code here to validate
        // user is actually passing correct color
        // for example :
        // Red, Blue is valid color
        // ABC, EFG is not valid color
        color = newColor;
    }
}
