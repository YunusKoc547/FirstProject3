package day06;

public class CompoundOperator2 {

    public static void main(String[] args) {

        // +=, -=, *=, /=, %= are called shorthand operator, or compound operator
        // It can simplify the operation if you have the same variable
        // on both sides of the assignment

        int studentOnline = 263;
        System.out.println("Student count: " + studentOnline);

       // studentOnline = studentOnline +5;
        studentOnline += 5;

        System.out.println("5 people joined: " + studentOnline);

        //studentOnline = studentOnline - 3;
        studentOnline -= 3;

        System.out.println("3 people left the class: " + studentOnline);

        //studentOnline = studentOnline *2;
        studentOnline *= 2;

        System.out.println("Student count doubled: " + studentOnline);

        //studentOnline = studentOnline / 3;
        studentOnline /= 3;

        System.out.println("The student count dropped to 1/3: " + studentOnline);

    }


    }

