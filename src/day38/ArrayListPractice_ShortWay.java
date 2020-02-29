package day38;

import day36.ArraysListIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {

    public static void main(String[] args) {

        // create List of 6 double in short way,
        // we will just read them and will not ad or remove item
        List<Double> prices = Arrays.asList(0.99, 9.99, 5.55, 0.99, 3.76, 8.99, 65.67);


        int count = 0;
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) > 5) {
                ++count;
            }
        }
        System.out.println(count);

        System.out.println("prices = " + prices);

        // I want to add 2 more prices (does not have to be same list)
        ArrayList<Double> newPrices = new ArrayList<>(prices);
        newPrices.add(199.99);
        newPrices.remove(0.99); // remove() method will remove first occurrence of the value
        System.out.println("newPrices = " + newPrices);


        // Create an ArrayList Object in one shot with many items so we can add or remove

        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99, 5.55, 3.76, 8.99));
        
        // Add 100.00 after 9.99
        oneShotPrice.add(1,100.99);
        System.out.println("oneShotPrice after adding 100.99 = " + oneShotPrice);

        // remove item 3
        oneShotPrice.remove(2);
        System.out.println("oneShotPrice after removing 3rd item = " + oneShotPrice);



    }
}
