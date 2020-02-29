package day32;

public class MethodWithReturnTypePractice {

    public static void main(String[] args) {

        System.out.println(divide(10,3));
        System.out.println(divide(10,0));
        System.out.println(divide(0,10));
    }

    // create a method called divide
    // it has 2 double parameters and returns the result as double


    public static double divide(double num1, double num2) {

        if (num2 == 0) {
            return 0.0;
        }else {
            return num1/num2;
        }
    }
}
