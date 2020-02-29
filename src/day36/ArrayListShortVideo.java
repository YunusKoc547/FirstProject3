package day36;

import java.util.ArrayList;

public class ArrayListShortVideo {

    public static void main(String[] args) {

        // adding elements
        ArrayList name = new ArrayList(2);
        name.add("Apple"); name.add("Orange"); name.add("Banana");
        System.out.println(name);

        // getting elements    get(index)
        System.out.println("first element " + name.get(0));
        System.out.println("second element " + name.get(1));

        // check if items exists in the lost contains(item)
        System.out.println(name.contains("Apple"));
        System.out.println(name.contains("Pear"));

        // getting the index of item by value indexOf
        System.out.println("index of Apple " + name.indexOf("Apple"));

        // checking how many item in the list size()
        System.out.println("item count " + name.size());

        // checking if the list is empty isEmpty();
        System.out.println("list is empty? " + name.isEmpty());

        // setting the value for certain index
        name.set(1,"Pear");
        System.out.println("new list items " + name);

        // removing item by index
        name.remove(0);
        System.out.println("new list items after deleting " + name);

        // removing item by value
        name.remove("Banana");

        // removing all the items in list
        name.clear();
        System.out.println("new list items after clearing " + name);





    }
}
