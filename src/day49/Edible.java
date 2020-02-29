package day49;

// interface is like a contract
// once someone sign a contract they will provide all the details that they must do

// AN INTERFACE IS NOT A CLASS !!!!!!
public interface Edible {

    // IN INTERFACE fields are automatically public static final if not defined so
    // public static final field naming convention is ALL_CAPS!!!
    // You can have as many constants as you want
    boolean IS_HUMAN_FOOD = true;

    // If a method with no-body is not defined public abstract, it's automatically public abstract
    public abstract void eat();
    public abstract void drink();
    public default void digest() {
        System.out.println("YOU IMPLEMENT THE CODE YOURSELF !!");
    }
}
