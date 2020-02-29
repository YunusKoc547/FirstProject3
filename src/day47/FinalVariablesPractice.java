package day47;

public class FinalVariablesPractice {

    public static void main(String[] args) {

        // declaring and initializing a variable
        // declaring and assigning initial value
        int x = 10;
        // re-assigning a new value to the variable
        // storing/giving a new value to the variable
        // changing the original value of the variable
        x = 100;

        // declaring and initializing a variable
        // declaring and assigning initial value
        final int a = 20;
        // re-assigning new value to the final variable -- ERROR!!!!!!
        // a = 200;

        final Student s1 = new Student(101);
        System.out.println(s1.studentID);
        // cannot reassign the value because it's final
//        s1 = new Student(102);
        // you can still change internal data attached to the object
        // as long as it's the same object s1 is pointing to
        // as long as the address does not change
        // s1.studentID = 200;
        System.out.println(s1.studentID);
        // Student.school = "abc";
        System.out.println(Student.school);

        System.out.println(Byte.MAX_VALUE);

        // P1 in Java
        System.out.println(Math.PI);
        printDoubleNumber(12);
    }


    // anywhere we declare a variable we have option to make it final (including method parameter)
    // making method parameter final
    // it will make the method only use the argument user passed without modifying it
    public static void printDoubleNumber(int x) {
//        x = x * 2;
//        System.out.println("x * 2 = " + x);
        System.out.println("x * 2 = " + x * 2);

        final String name = "Michael";
        // name = "Zehra"; <<-- ERROR
    }
}
