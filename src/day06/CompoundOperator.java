package day06;

public class CompoundOperator {

    public static void main(String[] args) {

        int studentOnline = 263;
        System.out.println("Student count: " + studentOnline);

        studentOnline = studentOnline +5;

        System.out.println("5 people joined: " + studentOnline);

        studentOnline = studentOnline - 3;

        System.out.println("3 people left the class: " + studentOnline);

        studentOnline = studentOnline *2;

        System.out.println("Student count doubled: " + studentOnline);

        studentOnline = studentOnline / 3;
        System.out.println("The student count dropped to 1/3: " + studentOnline);

    }
}
