package day06;

public class UsingTheValueOfOtherVariables {

    public static void main(String[] args) {

        int myFavoriteNumber = 300;

        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100;
        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        // Create a variable called yourOrder, type String and assign a value

        // Create another Variable called myOrder and assign the value
        // to same value as yourOrder by copying
        // and just print them out.

        String yourOrder = "Chicken and rice";
        String myOrder = yourOrder;

        System.out.println("My order is " + myOrder + " and your order is " +  yourOrder +  ".");



















    }
}
