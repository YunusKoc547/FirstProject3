package day47;

// cannot extend final class
// public class Sport{ // extends String {

public class Sport{

    // final method cannot be overridden in sub class
    // it can just be used as is in sub class
    // just like family tradition
    // it should stay the same for generations to come
    public void doSomething() {
        System.out.println("doing regular sport");
    }

    public void doSomethingElse() {
        System.out.println("something else");
    }
}
