package day54;

public class Dog extends Animal implements IndoorPet {

    String name;

    @Override
    public void speak() {
        System.out.println("BARK");
    }

    @Override
    public void play() {
        System.out.println("Fetch");
    }
}
