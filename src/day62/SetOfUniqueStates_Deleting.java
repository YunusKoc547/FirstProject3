package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("Pennsylvania","Pennsylvania","California","Florida","California","Texas", "new york"));
        System.out.println("states before = " + states);

        // The Lambda expression way of removing
        states.removeIf( each -> each.contains("a"));
        System.out.println("states after = " + states);

        // remove all the states with letter A
        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods: hasNext(), next(), remove() works together
        // to remove item while iterating over a collection
//        while (stIter.hasNext()) {
//
//            // PLEASE DO NOT CALL NEXT METHOD TWICE IN ONE ITERATION OR IT WILL SKIP TO NEXT ITEM
//            if (stIter.next().contains("a")) {
//                System.out.println("removing = " + stIter.next());
//                stIter.remove();
//            }
//        }
//        System.out.println("states after = " + states);

        // System.out.println("stIter.hasNext() = " + stIter.hasNext());
        // IF YOU TRY TO GET THE NEXT ITEM THAT YOU DO NOT HAVE USING ITERATOR
        // YOU WILL GET NoSuchElementException
        // System.out.println("stIter.next() = " + stIter.next());
    }
}
