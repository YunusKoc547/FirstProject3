package day36;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        // Create an ArrayList object of Long and assign it to a variable
        ArrayList<Long> lst = new ArrayList<>();

        //        C.R.U.D.
//                Create, Read, Update, Delete
        // add item, read item, update the item, remove the item, check the location ...

        lst.add(12L); // 12L is automatically converted to new Long(12L); because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
        lst.add(null);

        System.out.println("lst = " + lst);
        // I want to insert 125 between 100: and 150L, basically 2nd and 3rd item
        lst.add(2,125L);
        System.out.println("lst = " + lst);

        System.out.println("lst.get(3) = " + lst.get(3));

        // updating the value at certain index : set method
        lst.set(3,195L);
        System.out.println("NEW VALUE FOR lst.get(3) = " + lst.get(3));

        System.out.println("lst = " + lst);
        
        // removing item by it's value
        lst.remove(100L);
        System.out.println("lst after removing 100 = " + lst);

        // removing item by it's index
        lst.remove(2);
        System.out.println("lst after removing index 2 = " + lst);

        // looking for location of certain item
        System.out.println("location of 100L = " + lst.indexOf(100L));

        // check whether lst is empty or not
        System.out.println("lst size is greater than 0 : " + (lst.size() > 0));
        System.out.println("lst is empty : " + lst.isEmpty());
        
        // check whether we have certain item or not
        System.out.println("lst contains 100L : " + lst.contains(100L));

        // how do I check whether a list contains an item without using contains method
        // use indexOf, if it returns -1, it means we don't have it
        System.out.println("Do I have 10L : " + (lst.indexOf(10L) != -1));
    }
}
