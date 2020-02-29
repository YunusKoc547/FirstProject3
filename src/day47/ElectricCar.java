package day47;

public class ElectricCar extends Car{

    int batteryLevel;

    @Override
    public void start() {
        System.out.println("This is how electric car start");
    }

    @Override
    public void goForward() {
        System.out.println("ELECTRIC CAR GOING FORWARD");
    }

    @Override
    public void goBackward() {
        System.out.println("ELECTRIC CAR GOING BACKWARD");
    }

    @Override
    public void turn(String direction) {
        System.out.println("ELECTRIC CAR TURNING " + direction);
    }

    public static void main(String[] args) {

//        Car c1 = new Car();

        ElectricCar e1 = new ElectricCar();
    }
}
