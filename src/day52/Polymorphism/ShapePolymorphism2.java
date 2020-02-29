package day52.Polymorphism;

public class ShapePolymorphism2 {

    public static void main(String[] args) {

        Shape s1 = new Circle("penny",5);
        printAnyShapeArea(s1);
        Shape s2 = new Rectangle("Book",10,5);
        printAnyShapeArea(s2);
        // here we are directly passing the sub class object
        // to a method that has Shape as parameter type
        printAnyShapeArea(new Square("Bob",6));
        drawShape3Times(s1);
        drawShape3Times(s2);

    }

    // Create a static method called drawShape3Times
    // it has Shape as parameter
    // return nothing
    // it will draw the shape 3 times
    public static void drawShape3Times(Shape anyShape) {
        anyShape.draw();
        anyShape.draw();
        anyShape.draw();
    }

    // create a method that accepts any Shape and prints out calculated area
    public static void printAnyShapeArea(Shape anyShape) {
        anyShape.calculateArea();
        System.out.println(anyShape.name + "'s area is " + anyShape.area);
    }
}
