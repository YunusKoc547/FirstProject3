package day49;

public interface Juicy {

    public abstract void melt();

    // another type of method Interface can have is :
    // static method, it must have a body
    // and it's there to provide some utility methods
    // that does not belong to any class
    // STATIC METHODS of interface ARE NOT INHERITED!!!!

    public static void squeeze() {
        System.out.println("static squeezing");
    }
}
