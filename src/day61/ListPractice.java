package day61;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {

        // Common List methods / on top of methods from Collection

        List<Double> lst = new LinkedList<>(Arrays.asList(3d,4d,27d,66d,3d,3d,44d));

        System.out.println(lst);

        // accessing items using index
        System.out.println("first item : lst.get(0) = " + lst.get(0));

        // adding items in certain index
        lst.add(1, 5d);
        System.out.println(lst);

        // updating items in certain index
        lst.set(0,99.0);
        System.out.println(lst);

        // getting indexes of certain items
        System.out.println("lst.indexOf(4.0) : " + lst.indexOf(4.0));
        System.out.println("lst.indexOf(3.0) = " + lst.indexOf(3.0));
        System.out.println("lst.lastIndexOf(3.0) = " + lst.lastIndexOf(3.0));
        System.out.println("if item not found : " + lst.indexOf(100.0));

        // remove (Object)
        // remove (index)
        System.out.println("remove second item : lst.remove(1) : " + lst.remove(1));
        System.out.println(lst);

        // addAll at certain index
        lst.addAll(2,Arrays.asList(99D,89D));
        System.out.println(lst);

        // replaceAll (Function : UnaryOperator)
        System.out.println("replace each item with new value increased by 5 : ");
        lst.replaceAll(each -> each + 5);
        System.out.println(lst);

        // sort in ascending order
        lst.sort(null);
        lst.sort(Comparator.naturalOrder());
        System.out.println(lst);

        // sort in descending order
        lst.sort(Comparator.reverseOrder());
        System.out.println(lst);

        // getting view out of list object
        // view is part of your original list object
        // subList (from,to)

        System.out.println("lst.sublist(3,7)); = " + lst.subList(3,7));

        List<Double> partOfListView = lst.subList(2,5);
        System.out.println(partOfListView);
        partOfListView.set(0,199.99);
        System.out.println(partOfListView);
        System.out.println(lst);
    }
}
