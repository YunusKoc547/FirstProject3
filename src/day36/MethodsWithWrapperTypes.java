package day36;

public class MethodsWithWrapperTypes {

    public static void main(String[] args) {

        Integer i1 = 12;
        Integer i2 = 20;

        sumAndPrint(i1, i2);

        sumAndPrint(23, 10);

        sumAndPrint(new Integer(23), new Integer(10));
        sumAndPrint(Integer.valueOf(23),Integer.valueOf(10));

        System.out.println("------------ method with int parameter ----------");
        printTheDoubledValue(10);

        printTheDoubledValue(Integer.valueOf(10));

    }
    /*
    This method adds 2 Integer numbers and print
    @param num1 type Integer, first number to add
    @param num2 type Integer, second number to add
     */
    public static void sumAndPrint(Integer num1, Integer num2) {
        // We cannot add two objects
        // what is happening here is
        // the moment the + operator appeared,
        // compiler will turn num1 and num2 into int so it can add them numerically
        // Integer to int conversion -->> auto-unboxing
        System.out.println(num1 + num2);
    }

    public static void printTheDoubledValue(int x) {
        System.out.println("after doubling x = " + x*2);
    }
}
