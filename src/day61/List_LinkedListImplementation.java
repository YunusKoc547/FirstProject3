package day61;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {

    public static void main(String[] args) {

        // ArrayList is backed by array in the back
        // so if we have ArrayList with 4 elements
        // in the back we have array with size 4 holding all those elements

        // if you add one item to the list using add method
        // it will create an array with size 5 then copy all for above
        // and add the new item at the end

//        List<String> list = new ArrayList<>();

        // linked list is backed by something called Node
        // see it as 4 people holding hands
        // the neighboring person have pointer to previous and next person
        // because they are holding hands

        // if you want to add one person, new person will just have to hold last person's hand
        // if you want to insert in the middle
        // new person just need to hold previous and next person's hand
        List<String> list = new LinkedList<>();
        list.add("Zeynep");
        list.add("Ershat");
        list.add("Kamira");
        list.add("Sabira");

        System.out.println("list = " + list);

        list.remove("Ershat");
        System.out.println("list = " + list);







    }
}
