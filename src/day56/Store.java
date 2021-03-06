package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

    // I added this name as new requirement so we can identify our store by name
    String name; // adding a field so we can give a name to Store object when we create one
    private List<Product> allProducts;  // store has List of products

    //    2 Arg constructor to accept List<Product>
//    First line of constructor should call no arg constructor to reuse initialization logic.
    public Store(String name, List<Product> otherList) {
        this(); // calling no arg constructor here
        this.name = name;
        allProducts.addAll(otherList);
    }


    /**
     * A method to calculate the average price
     *
     * @return The Average Price
     */


    public double getAveragePrice() {
        // average is sum of the products divided by product count
        return findSumOfAllProductPrice() / getProductCount();
    }

    public int findSumOfAllProductPrice() {
        int sum = 0;
        for (Product each : allProducts) {
            sum += each.getPrice();
        }
        return sum;
    }

    /**
     * It will check whether we have the product in the list
     *
     * @param p Product object to be checked
     * @return true if the list contains the product
     */
    public boolean checkIfProductExists(Product p) {
        return allProducts.contains(p);
    }

    /**
     * Find out 0 based location of the product in the store
     *
     * @param p product object to be checked
     * @return the index of the product in the list
     */
    public int indexOfProduct(Product p) {
        return allProducts.indexOf(p);
    }

    public void removeProduct(Product p) {
        if (checkIfProductExists(p) == true) {
            allProducts.remove(p);
        } else {
            System.out.println("We dont have " + p);
        }
    }

    /**
     * Display all products in human readable manner
     */
    public void displayProducts() {
        System.out.println(name + "'s Store has below product: ");
        for (Product each : allProducts) {
            System.out.println("\t each = " + each);
        }
    }

    /**
     * Counting how many products we have in the store
     *
     * @return the size of allProducts List
     */
    public int getProductCount() {
        return allProducts.size();
    }

    /**
     * This version of addProduct will directly accept ready Product object
     * so it can be added to the allProducts list
     *
     * @param p Product to be added
     */
    public void addProduct(Product p) {
        System.out.println("calling addProduct(Product p)");
        allProducts.add(p);
    }

    public Store() {
        this.name = "Cybertek Store";
        // creating ArrayList object here
        // eventually we would have to do it anyway!
        this.allProducts = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }

    /**
     * A method to get most expensive Product
     *
     * @return The product object with max price
     */
    public Product getMostExpensiveProduct() {

//        int max = allProducts.get(0).getPrice();
        // assume my max price is lowest number in integer range so it will be replaced by any price
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int x = 0; x < allProducts.size(); x++) {

            if (allProducts.get(x).getPrice() > max) {
                max = allProducts.get(x).getPrice();
                maxIndex = x;
            }

        }
        System.out.println("max = " + max);
        return allProducts.get(maxIndex);
    }
}


