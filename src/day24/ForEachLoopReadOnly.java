package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;

        long[] nums = {10, 40, 20 };

        for (int x = 0; x < 3; x++) {
            long eachItem = nums[x];
            eachItem = 100;
        }

        System.out.println("AFTER WE MODIFY THE VALUE");

    }
}

