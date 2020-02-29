package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates {

    public static void main(String[] args) {

        // Create a Set of String called states
        // add bunch of states with some duplicate
        // iterate over them using each and every way you know

        Set<String> states = new HashSet<>();
        states.addAll(Arrays.asList("Pennsylvania","Pennsylvania","California","Florida","California","Texas"));

        // any type of collection has size method to count the item
        System.out.println("How many?? states.size(); = " + states.size());

        for (String each : states) {
            System.out.println("each = " + each);
        }

        // FOR LOOP DOES NOT WORK! NO INDEX!
        // We can use iterator for any type of collection at all times

        Iterator<String> stIter = states.iterator();
        
        while(stIter.hasNext()) {
            System.out.println("stIter.next() = " + stIter.next());
        }



    }
}
