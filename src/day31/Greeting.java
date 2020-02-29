package day31;

public class Greeting {

    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Batch 15");
        sayHelloTo("Kids");
        sayHelloTo("Study Hard");
    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    public static void sayHello() {
        System.out.println("Hello B15");
    }

    // (String blabla) this is called method parameter
    // it's used to tell called of this method
    // it's expecting this type of data when being called
}
