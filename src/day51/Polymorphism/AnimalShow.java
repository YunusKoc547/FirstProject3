package day51.Polymorphism;

public class AnimalShow {

//    Dog d1 = new Dog();

    // we are referring Dog objects using Animal reference

    public static void main(String[] args) {

        Animal a1 = new Dog();
        a1.makeNoise();
        a1 = new Horse();
        a1.makeNoise();

        Animal a2 = new Horse();
        a2.makeNoise();

        Dog d1 = new Dog();
        Animal a3 = d1;
    }
}
