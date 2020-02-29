package day31;

// WHY DO WE NEED TO HAVE A METHOD
// REUSABLE CODE !!!

public class MethodIntro {

    public static void main(String[] args) {

        // two ways to call static methods
        // ClassName.methodName(external data if needed)
        // if you are in same class
        // you can directly call them
        // methodName (external data if needed)
        //MethodIntro.sayHello();
        System.out.println("Begin");
        sayHello();
        System.out.println("-----------");
        sayHello();
        System.out.println("THE END");


    } // MAIN METHOD ENDS HERE !!!

    // DO NOT CREATE A METHOD INSIDE A MAIN METHOD
    public static void sayHello(){

        System.out.println("Hello World");
        System.out.println("My Name is Yunus");
        System.out.println("I love Java");

    }
}
