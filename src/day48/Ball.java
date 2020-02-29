package day48;

public class Ball implements Bouncible{

    String color;
    String shape;

    public Ball(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                '}';
    }

    @Override
    public void bounce() {
        System.out.println("This " + shape + " and " + color +
                " ball is bouncing if gravity is " + gravity);
    }
}
