package day36;

import java.util.ArrayList;

public class ArrayListPracticeDemo {

    public static void main(String[] args) {

        int[] nums = {11,33,44,11,33,44,22,22,55,44,33,};

        ArrayList<Integer> uniqueList = new ArrayList<>();
        
        // I want to add items to uniqueList if it does not already contains that item

        for (int eachNum : nums) {
            if (!uniqueList.contains(eachNum)) {
                uniqueList.add(eachNum);
            }
        }
        System.out.println("uniqueList = " + uniqueList);
    }
}
