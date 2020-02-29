package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {

    public static void main(String[] args) {

        // this is the ArrayList constructor that accepts any type of Collection object
        // public ArrayList(Collection<E> c) { }

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10,4,5,22,88,13));

        // iterating over a collection object using iterator
        Iterator<Integer>myIter = nums.iterator();

        while (myIter.hasNext()) {
            if (myIter.next() <= 10) {
                myIter.remove();
            }
        }

        // hasNext() -->> check whether you have next item
        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        // next() -->> will move the pointer of iterator to the next element
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());
        System.out.println("myIter.next() = " + myIter.next());

        myIter.remove();

        System.out.println("myIter.next() = " + myIter.next());

        System.out.println("myIter.hasNext() = " + myIter.hasNext());
    }
}
