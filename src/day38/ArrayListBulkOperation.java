package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {

    public static void main(String[] args) {

        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");
        System.out.println("groceries = " + groceries);

        ArrayList<String> newList = new ArrayList<>(groceries);
        newList.add("Diet coke");
        newList.add("Sugar");

        System.out.println("newList = " + newList);

        // actually I have list of items for you here : pasta, branzini, asparagus, spinach
        // good news is I already created a List object for you so you can just add them all to your existing list
        List<String> newItemsToAdd = Arrays.asList("pasta", "branzini", "asparagus", "spinach");
        System.out.println("newItemsToAdd = " + newItemsToAdd);
        
        // Adding one list to another list
        // we want to add all items inside newItemsToAdd to newList
        newList.addAll(newItemsToAdd);
        System.out.println("newList with all items = " + newList);

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(100);
        nums1.add(223);
        nums1.add(133);
        nums1.add(125);
        nums1.add(122);
        System.out.println("nums1 = " + nums1);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(1000);
        nums2.add(2000);
        System.out.println("nums2 = " + nums2);

        // add all nums2 items into nums1
        nums1.addAll(nums2);
        System.out.println("new nums1 = " + nums1);

        // add 4 items to nums2 using ad all
        nums2.addAll(Arrays.asList(100,200,300,400));
        System.out.println("nums2 after adding 4 items = " + nums2);
    }
}
