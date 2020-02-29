package day47;

public class Rectangle extends Shape{

    int width;
    int height;

    public Rectangle(int width, int height) {
        // I want to set the name to word Rectangle
        super("my rectangle");
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
