package day51.Polymorphism;

import java.util.Arrays;
import java.util.List;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

//        s1.draw();
//        s2.draw();
//        s3.draw();

        System.out.println("------------For Each loop----------");

        Shape[] allShapes = {s1,s2,s3, new Triangle(),s2};

        for (Shape eachShape : allShapes) {
            eachShape.draw();
        }
        System.out.println("------------For loop----------");

        for (int i = 0; i < allShapes.length; i++) {
            allShapes[i].draw();
        }

        System.out.println("------------For Each with List----------");

        // Quick way to create a list -->> CAN WE ADD OR REMOVE ITEMS FROM THIS SHORT WAY? NO!!
        List<Shape> shapeList = Arrays.asList(s1,s2,s3,s2,s1);

        for (Shape eachShape : shapeList) {
            eachShape.draw();
        }

        System.out.println("------------For loop with List----------");
        for (int i = 0; i < shapeList.size(); i++) {
            shapeList.get(i).draw();
        }
    }
}
