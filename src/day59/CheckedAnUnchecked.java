package day59;

import java.io.IOException;

public class CheckedAnUnchecked {

    public static void main(String[] args) {

        String x = "abc";
        System.out.println(x.charAt(100));

        // Exception Hierarchy

        // Throwable -->> child class -->> Exception

        // Under Exception class
        // There is one sub class known as RunTimeException
        // Anything IS-A RunTimeException regarded as UncheckedException
        // UncheckedException are not required to be handled at compiled time

        // How do we know the exception is UncheckedException
        // check whether it's a RunTimeException or sub class of RunTimeException

        // try to throw the exception programmatically if it compiles, it means it's RunTimeException
        // throw ne RuntimeException("just throwing it out!");

        // what is checked exception
        // an exception type that must be handled at exception but not RunTimeException
        // programmer are required to handle(or declare) this type of exception

        // is the class Exception a type of checked exception or unchecked?

        try {
            throw new IOException("just throwing this way");
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
    }
}
