package day54;

public class AnimalShow {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.play();
        // refer a dog object as Animal
        // it can do only those things Animal can do
        // only the speak method in this case
        Animal a1 = d1;
        a1.speak();

        // refer a dog object as a Object
        // it can do only those things Object can do
        // for example: toString, hasCode and other
        Object o1 = d1;
        // refer a dog object as an IndoorPet
        // it can only play
        IndoorPet p1 = d1;
        p1.play();
    }
}
