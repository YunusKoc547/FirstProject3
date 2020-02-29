package day55;

public class Casting {

    public static void main(String[] args) {

        int x = 10;

        long y = x; // it works automatically

        byte b = (byte) x; // need to be casted explicitly

        Object o = new Dog("Chiwava");

    }
}
