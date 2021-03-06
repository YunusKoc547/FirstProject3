package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest2 {

    public static void main(String[] args) {

        List<Product> denisList = Arrays.asList(new Product("cookie",1), 
                new Product("tea",3),
                new Product("coffee",7),
                new Product("muffins",5) );
        
        Store s2 = new Store("Denis Store",denisList);
        System.out.println("s2 = " + s2);
        
        Product p1 = new Product("CheeseCake",10);
        s2.addProduct(p1);
        System.out.println("s2 = " + s2);
        // s2.addProduct("Latte",3);
        System.out.println("s2 = " + s2);

        System.out.println("s2.getProductCount() = " + s2.getProductCount());

        System.out.println("s2.getMostExpensiveProduct() = " + s2.getMostExpensiveProduct());
    }
}
