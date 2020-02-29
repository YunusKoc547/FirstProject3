package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListUpdateValuePractice {

    public static void main(String[] args) {

        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.39);
        priceList.add(3.95);
        priceList.add(11.29);
        priceList.add(1.2);
        priceList.add(3.99);
        priceList.add(65.59);
        priceList.add(999.99);

        System.out.println("priceList = " + priceList);

        // change the third price to $10
        priceList.set(2,10.0);
        System.out.println("priceList = " + priceList);

        // Add 4 dollars to first price
        priceList.set(0, priceList.get(0) + 4);
        System.out.println("priceList = " + priceList);

        // change last price to support of first and second price
        Double sumOfFirst2Items = priceList.get(0) + priceList.get(1);
        priceList.set(priceList.size()-1,sumOfFirst2Items);
        System.out.println("New priceList = " + priceList);

        // give 40% off to second price
        priceList.set(1,priceList.get(1) * 0.6);
        System.out.println("AFTER 40% OFF " + priceList.get(1));
        System.out.println("priceList = " + priceList);

        // DOUBLE THE VALUE OF EACH AND EVERY PRICE IN THE LIST
        for (int i = 0; i < priceList.size(); i++) {
            priceList.set(i, priceList.get(i) * 2 );
        }
        System.out.println("priceList = " + priceList);

        // Cut the price into half if the price is more than $20
        for (int i = 0; i < priceList.size(); i++) {
            double eachPrice = priceList.get(i);
            if (eachPrice > 20) {
                priceList.set(i, eachPrice / 2);
            }
        }
        System.out.println("priceList = " + priceList);

        // swap the first value with the last value
        int lastIndex = priceList.size()-1;
        Double temp = priceList.get(0);
        priceList.set(0,priceList.get(lastIndex));
        priceList.set(lastIndex,temp);

        System.out.println("priceList after swapping first and last value : " + priceList);

    }
}
