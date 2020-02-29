package day48;

import javax.swing.*;

public class Kangaroo implements Bouncible, Boxer {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce() {
        System.out.println("Kangaroo can jump " + jumpDistance + " meters in " + gravity + " gravity");
    }

    public void eat() {
        System.out.println("Kangaroo eats");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name " + name + " is boxing");
    }

    @Override
    public void carryChildInPouch() {
        System.out.println("Kangaroo with name " + name + " is carrying a child in the pouch");
    }
}
