package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //pseudo code
        /*

        more than 70 and less than 80 = point taken
        more than 60 and less than 70 = warning

        if not speeding keep driving

         */

        int currentSpeed = 61;

        if (currentSpeed > 70) {
            System.out.println("you are going over 70mph, Points taken! ");
        }
        // asking whether it is less than 70 or more than 60
        else if ( currentSpeed > 60 ) {
            System.out.println("Your speed is less than or equal to 70mph but over 60mph, you have received a warning");

        }
        else {
            System.out.println("Keep driving, you are good");


        }






















    }
}
