package day27;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        int num = 10;
        int[] arr = {10,20,30,40,50,60};
        int num1 = arr[arr.length-1];
        System.out.println(num1);
        for (int x = 0; x < arr.length ; x++) {
            System.out.print(arr[x] + " ");
        }
        System.out.println("\n===============");
        // Arrays.toString(VariableName)
        String str = Arrays.toString(arr);
        System.out.println(str);
    }
}
