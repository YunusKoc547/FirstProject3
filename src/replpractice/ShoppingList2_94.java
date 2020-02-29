package replpractice;

import java.util.Scanner;

public class ShoppingList2_94 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        int itemNumber = 0;




        do {
            ++itemNumber;
            System.out.println("Enter Item" + itemNumber + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            shoppingListReport = shoppingListReport + ("Item" + itemNumber + ": " + item + " Price: " + price + ", ");
            totalPrice = totalPrice + price;
            countinue = scan.next();
        }while (countinue.equals("yes"));

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));

        System.out.println("Total price: " + totalPrice);
    }
}
