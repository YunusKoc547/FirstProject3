package day50;

public class Main {

    public static void main(String[] args) {

        Square s1 = new Square("Bob",10);
        System.out.println("s1 = " + s1);
        s1.calculateArea();
        System.out.println("s1 = " + s1);
        s1.draw();
    }
}
