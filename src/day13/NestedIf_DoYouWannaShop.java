package day13;

public class NestedIf_DoYouWannaShop {

    public static void main(String[] args) {

        // create a boolean to store the result of doYouWantToShop
        // if yes, do you want to go to store or do you want to shop online
        // if user does not want to shop at all, print "good job, stay home coding!!!"
        boolean youWantToShop = true;
        String preference = "online";

       // if (youWantToShop)

        if (youWantToShop == true) {

            if (preference.equalsIgnoreCase("store")) {
                System.out.println("GOING TO STORE FOR SHOPPING");
            }
            else if (preference.equalsIgnoreCase("online")) {
                System.out.println("GOING ONLINE FOR SHOPPING");
            }
            else {
                System.out.println("SHOPPING PREFERENCE UNKNOWN");
            }
        }
        else {
            System.out.println("Good Job, stay home coding!!!");
        }
    }
}
