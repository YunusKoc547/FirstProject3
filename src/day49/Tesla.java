package day49;

public class Tesla extends Vehicle implements Autonomous{

    int horsePower;
    String color;

    public Tesla(int year, int horsePower, String color) {
        super(year);
        this.horsePower = horsePower;
        this.color = color;
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is driving itself");
    }

    @Override
    public void start() {
        System.out.println("Tesla is starting up");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Tesla t1 = new Tesla(2020,500, "white" );
        System.out.println("t1 = " + t1);
        t1.selfDrive();
        t1.start();
    }


}
