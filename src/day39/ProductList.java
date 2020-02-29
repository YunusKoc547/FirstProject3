package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductList {

    public static void main(String[] args) {

        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18"));

        
        String itemDetails = "iphone 6s, 449, 18.71";
        String[] itemSplitArr = itemDetails.split(",");
        String name = itemSplitArr[0];
        System.out.println("name = " + name);

        double price = Double.parseDouble(itemSplitArr[1]);
        System.out.println("price = " + price);

        double monthly = Double.parseDouble(itemSplitArr[2]);
        System.out.println("Monthly = " + monthly);

        itemDetails = name + "," + price * 0.2 + "," + monthly * 0.2;
        System.out.println("monthly = " + monthly);


        
        // Task 1 : print only items name
        for (String eachProduct : productLst) {

            String namePart = eachProduct.split(",")[0];
            System.out.println("eachProduct name = " + namePart);
        }

        // Task 2 : print all the prices more than 500

        for (String eachProduct : productLst) {

            price = Double.parseDouble(eachProduct.split(",")[1]);

            if (price > 500) {
                System.out.println("price = " + price);
            }
        }

        // Task 3 : print average price
        double sum = 0;
        double average = 0;

        for (String eachProduct : productLst) {

            price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price;
            average = sum / productLst.size();
            System.out.println("sum = " + sum);
            System.out.println("average = " + average);
        }

        // Task 4 : print all the items name that has less than $20 monthly payment
        for (String eachProduct : productLst) {
            double monthlyPrice = Double.parseDouble(eachProduct.split(",")[2]);
            if (monthlyPrice < 20) {
                System.out.println("monthlyPrice = " + monthlyPrice);
            }
        }

        // Task 5 : Print the monthly payments of all the iPhones no matter what model
        for (String eachProduct : productLst) {
            name = eachProduct.split(",")[0];
            monthly = Double.parseDouble(eachProduct.split(",")[2]);

            if (name.contains("iPhone")) {
                System.out.println(name + " " + monthly);
            }
        }

        // Task 6 : print all the information about most expensive item
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;
        for (int i = 0; i < productLst.size(); i++) {
            // this is how we get each price part of items details
            String priceStr = productLst.get(i).split(",")[1];
            // this is how we turn the priceString into double data type
            price = Double.parseDouble(priceStr);
            if (price > maxPrice) {
                maxPrice = price;
                maxPriceIndex = i;
            }
        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("expensive item detail = " + productLst.get(maxPriceIndex));

        // Task 7 : Update Dyson price to 80% 0ff (Monthly payments should also be calculated)
        int dysonIndex = 0;
        for (int i = 0; i < productLst.size(); i++) {
            if (productLst.get(i).contains("Dyson")) {
                dysonIndex = i;
            }
        }
        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productLst.get(dysonIndex);
        String priceStr = dysonDetails.split(",")[1];
        price = Double.parseDouble(priceStr);
        dysonDetails = dysonDetails.replace(priceStr, "" + price * 0.2);
        System.out.println("dysonDetails = " + dysonDetails);

        // Task  8 : Count all the items

        // Task 9 : Remove all the items with prices more than average price
        for (int i = 0; i < productLst.size(); i++) {

            price = Double.parseDouble(productLst.get(i).split(",")[1]);

            if (price > average) {
                productLst.remove(productLst.get(i));
            }
        }
        System.out.println(productLst);



    }
}
