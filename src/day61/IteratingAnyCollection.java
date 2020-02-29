package day61;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<>(Arrays.asList(3,4,5,2,66,544,31));

        System.out.println(coll);

        Iterator<Integer> myIter = coll.iterator();

        // hasNext();
        System.out.println(myIter.hasNext());

        // next();
        System.out.println(myIter.next()); // 3
        System.out.println(myIter.next()); // 4
        System.out.println(myIter.next()); // 5
        System.out.println(myIter.next()); // 2
        System.out.println(myIter.next()); // 66

        // remove();
//        myIter.remove();
//        System.out.println(myIter.next());

        while (myIter.hasNext()) {
            Integer each = myIter.next();
            System.out.println(each + " ");
            if (each > 10) {
                myIter.remove();
            }
        }

        System.out.println(myIter.hasNext());
        System.out.println(coll);


        // cannot add or remove in for each loop
        for (Integer each : coll) {
            System.out.println(each);
            if (each > 10) {
                coll.remove(each);
            }
        }
















    }
}
