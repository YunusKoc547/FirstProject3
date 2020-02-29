package day36;

public class WrapperReview {

    public static void main(String[] args) {

        Integer i1 = new Integer(1000000000);
        Integer i2 = Integer.valueOf(123);

        // is i3 primitive type variable
        // is i3 reference type variable
        // Auto boxing : primitive to wrapper type conversion
        Integer i3 = 45; // -->> 45 -->> new Integers(45)

        int i4 = 54;
        // Auto unboxing : wrapper type to primitive type conversion
        int i5 = new Integer(100);

        // AUTO BOXING AND UNBOXING UNIQUE FEATURE
        // OF CONVERSION BETWEEN PRIMITIVE VALUE WRAPPER CLASSES OBJECTS



    }
}
