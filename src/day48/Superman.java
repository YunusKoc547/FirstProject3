package day48;

public class Superman implements Flyable{

    String name;
    int capacity;
    int speed;

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    // bad idea but just for demo purpose
    public static void main(String[] args) {

        Plane p1 = new Plane();
        p1.fly();
        // anything static, we can access in static way
        // including the static field of interface
        System.out.println(Flyable.HAVE_WING);
        // if we have static field in this class
        // can we access them in
    }
}
