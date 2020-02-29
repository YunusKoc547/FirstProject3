package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        
        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Iphone XL", 1299) ) ;
        productList.add( new Product("Samsung 10", 1188) ) ;
        productList.add( new Product("Samsung Note", 1288) ) ;

        System.out.println("productList.size() = " + productList.size());

        boolean result = productList.contains(new Product("Sony TV",499));
        System.out.println("Has Sony TV for 499 " + result);
        boolean result2 = productList.contains(new Product("Apple TV",299));
        System.out.println("Has Apple TV, with 299 or not result : " + result2);

        boolean sony = productList.contains(new Product("Sony TV",499));
        productList.remove(new Product("Sony TV",499));
        System.out.println(productList);


        System.out.println("Has Sony TV, with 499 price or not. result : " + result);

    }
}

