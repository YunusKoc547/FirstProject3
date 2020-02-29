package day47;

public abstract class Shape {

    String name;
    int area;

    // add a constructor to set the name
    public Shape(String name) {
        this.name = name;
    }

    // add an abstract method called calculateArea
    public abstract void calculateArea();

    // add two concrete class of Shape :
    // Triangle
    // instance fields : int height and base

    public abstract String toString();

}
