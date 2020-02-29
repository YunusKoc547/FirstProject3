package day13;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args) {
        /*
        Amazon has 2 types of users, one is a Prime member and another is a regular member
        prime member get free shipping in all purchase no matter the amount
        regular members get free shipping only if their purchase is more than $25
        otherwise they get a $5 shipping free
         */

        String memberType = "Prime member";
        double amount = 45.99d;
        int shippingFee = 0;

        // first I wanna check if it's a prime member or not
        if (memberType.equalsIgnoreCase("prime member")) {
            System.out.println("YOU ARE A PRIME MEMBER, YOU GET 1 DAY FREE SHIPPING");
            System.out.println("Your final price is " + amount);
        }
        else if (!memberType.equalsIgnoreCase("prime member") && amount > 25) {
            System.out.println("YOU ARE NOT A PRIME MEMBER BUT YOUR ORDER EXCEEDS $25");
            System.out.println("YOU GET FREE SHIPPING ON AMOUNT " + amount);
        }
        else  {
            System.out.println("WOULD YOU LIKE TO SIGN UP FOR A PRIME MEMBERSHIP");
            shippingFee = 5;
            amount += shippingFee;
            System.out.println("YOUR FINAL AMOUNT IS " + amount);
        }
    }
}
