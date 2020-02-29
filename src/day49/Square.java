package day49;

public class Square extends Shape implements Drawable{
    
    int field;
    int length;

    public Square(int field, int length) {
        this.field = field;
        this.length = length;
    }

    @Override
    public void calculateArea() {
        area = field * length;
    }

    public static void main(String[] args) {
        
        Square s1 = new Square(10,20);
        s1.calculateArea();
        s1.name = "Square";
        System.out.println("s1 = " + s1);

    }



    @Override
    public String toString() {
        return "Square{" +
                "field=" + field +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
