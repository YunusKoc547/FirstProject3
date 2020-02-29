package day52.Polymorphism;

public class Rectangle extends Shape{

    int width;
    int height;

    public Rectangle(String name, int width, int length) {
        super(name);
    }

    @Override
    public void calculateArea() {
        area = width * height;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
