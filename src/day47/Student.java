package day47;

public class Student {

    // final INSTANCE FIELD
    final int studentID;
    // public final static field with initial value set
    // This type of field name always suggested to make all uppercase
    // to make it clear that this is a public static field that never change
    // other languages have specific term called CONSTANT for this
    public static final String school = "Cybertek";

    public Student(int studentID) {
        this.studentID = studentID;
    }
}
