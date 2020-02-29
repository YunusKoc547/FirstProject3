package day34;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        System.out.println("Method overloading");
        System.out.println(12);

        String name = "Overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));

        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));

        // Arrays.toString has 9 different versions to accept different parameter

        // method overloading :
        // using same name and different parameter for methods
        // to reuse the name for similar actions
        sayHello();
        sayHello("Universe");
        sayHello("Denis");
        sayHello(9);
        System.out.println(sayHello("Yunus","Koc"));
    }

    public static void sayHello() {
        System.out.println("Hello, World");

    }

    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void sayHello(int num) {
        System.out.println("Hello, " + num);
    }

    public static String sayHello(String firstName, String lastName) {
        return "Hello, " + firstName + " " + lastName;
    }

}
