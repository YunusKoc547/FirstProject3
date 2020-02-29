package day49;

// you are building super-sub relationship, IS-A relationship
// a class can only extends one other class
// a class implements multiple interfaces
public class Burger implements Edible{

    public Burger() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink Soda");
    }

    @Override
    public void digest() {
        System.out.println("digest burger by chewing more");
    }

    public void melt() {
        System.out.println("juicy burger is melting");
    }


}
