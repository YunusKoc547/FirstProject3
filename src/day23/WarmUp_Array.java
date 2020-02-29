package day23;

public class WarmUp_Array {

    public static void main(String[] args) {


        int [] nums = {12,15,19,21, 27, 32};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);

        System.out.println();

        for (int x = nums.length-1; x >= 0 ; x--) {
            System.out.println("index " + x + " : " +  nums[x]);
        }

        int arraySize = nums.length;
        int lastItemIndex = arraySize-1;

        int lastItemValue = nums[lastItemIndex];
        System.out.println("last Item Value = " + lastItemValue);

        int middleItemIndex = arraySize/2;
        System.out.println("middle item value = " + nums[middleItemIndex]);

        int sum = 0;
        for (int x = 0; x < arraySize ; x++) {

            int currentItem = nums[x];
            sum = sum + currentItem;

        }
        System.out.println("sum = " + sum);


    }
}
