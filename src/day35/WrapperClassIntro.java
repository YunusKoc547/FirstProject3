package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x = 10;
        // primitive data types are pure value has no attribute or behavior

        // each primitive type has wrapper class that turn it into objtec so we can treat it as
        // this is the old not recommended way to create Integer Object
        Integer xObj1 = new Integer(12);

        // valueOf method of Integer class
        // return an integer objtec by wrapping up the value you passed
        // it has 2 overloaded version one that accept int, another accept String
        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("10");

        // since x2 is pointing to Integer Object
        // we can call all the methods
        byte bValue = xObj2.byteValue();
        System.out.println("bValue = " + bValue);

    }
}
