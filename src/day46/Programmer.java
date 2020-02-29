package day46;

// Programmer as super class
// JavProgrammer SQLProgrammer
// please override code and test under Sub classes

// JavaProgrammer
    // unique behavior : drinkCoffee, doRepl, doJavaDevelopment

// SQLProgrammer
// unique behavior : writeSQLQuery, createDataBase();

// OVERRIDING IS UNIQUE FOR INSTANCE METHOD
// THERE IS NO CONCEPT OF OVERRIDING FOR ANYTHING OTHER THAN INSTANCE METHOD


public class Programmer {

    void code() {
        System.out.println("any programmer code");
    }

    void test() {
        System.out.println("any programmer test");
    }
}
