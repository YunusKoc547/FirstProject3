package day10;

public class MultiBranchWithSwitch {

    public static void main(String[] args) {

        // At the McDonald's dive thru
        System.out.println("Welcome to McDonald's, what can I get for you? ");

        /*

        11 = Burger
        5 = French Fries
        8 = Chicken Nuggets
        35 = Ice Cream

         */

        String order = "";
        int itemNumber = 90;

        // what data type of variable can I use here
        // byte, short, int, char, String

        switch (itemNumber){
            case 11 :
                System.out.println("You have selected 11");
                order = "Burger";
                break;

            case 5 :
                System.out.println("You have selected 5");
                order = "French Fries";
                break;

            case 8 :
                System.out.println("You have selected 8");
                order = "Chicken Nuggets";
                break;

            case 35 :
                System.out.println("You have selected 35");
                order = "Ice Cream";
                break;
            default:
                System.out.println("You have selected an unknown item number");
                order = "Unknown";
                break;
        }
        System.out.println("Your order is " + order);
















    }
}
