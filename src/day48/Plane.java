package day48;

// we build relationship between class and interface
// using implements keyword
// (compared to extends keyword for class to class)
// it will build IS-A Relationship
// we can say Plane IS-A Flyable \ inheritance
// since we are inheriting an abstract method
// we need to provide body by overriding it
public class Plane implements Flyable{

    String name;
    int capacity;
    int speed;

    @Override
    public void fly() {
        System.out.println("Plane if flying");
    }
}
