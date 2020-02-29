package day49;

public abstract class Vehicle {

    int year;

    public Vehicle(int year) {
        this.year = year;
    }

    public Vehicle() {

    }

    public abstract void start();

    public void goForward() {

    }
}
