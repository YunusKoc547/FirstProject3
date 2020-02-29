package day60;

import java.util.*;

public class CollectionIntro {

    public static void main(String[] args) {

        // List<String> names = ArrayList<>();

        // List interface extends Collection interface
        // and ArrayList implements nList interface
        // So we can safely say ArrayList IS-A Collection
        // with this assignment we can access only what Collection interface have
        // so we can learn what any type of Collection including Set, Queue, List have in common

        List<String> names = new ArrayList<>();
        // with this assignment we can access only what Collection interface have
        // so we can learn what any type of Collection including Set, Queue, List have in common
        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");
        names.addAll(names); // addAll method parameter type is Collection (interface) so we can pass anything IS-A Collection

        names.removeAll(Arrays.asList("Hasan"));

        Collection<String> toRemoveLst = Arrays.asList("Abdullo");
        names.removeAll(toRemoveLst);
        System.out.println("names = " + names);

        for (String eachName : names) {
            System.out.println("eachName = " + eachName);
        }
    }
}
