package day43;

public class Pet {

    String breed;
    String name;

    public Pet() {
        this.breed = "unknown";
        this.name = "no-name";
    }

    public Pet(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void speak() {
        if (breed.equals("cat")) {
            System.out.println("meow");
        }else if (breed.equals("dog")) {
            System.out.println("woof");
        }else if (breed.equals("cow")) {
            System.out.println("moo");
        }else if (breed.equals("horse")) {
            System.out.println("nei");
        }else {
            System.out.println("Unknown animal");
        }
    }

    public static void showGeneralPetInfo() {
        System.out.println("PETS ARE FRIENDS OF HUMANS");
        // THIS WILL NOT WORK
        // NON-STATIC METHOD CAN NOT ACCESS ANYTHING NON-STATIC
        // System.out.println(name);
    }
}
