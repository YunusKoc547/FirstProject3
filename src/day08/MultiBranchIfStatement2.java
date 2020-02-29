package day08;

    public class MultiBranchIfStatement2 {

        public static void main(String[] args) {

              /*

        given your currentSpeed and speedLimit
        check whether the current speed is
        more than 90 = jail
        more than 80  and less than 90 = reckless driving
        more than 70 and less than 80 = point taken
        more than 60 and less than 70 = warning

               */

              int currentSpeed = 55;

              if (currentSpeed >= 90) {
                  System.out.println("Your speed is " + currentSpeed);
                  System.out.println("Your speed is equal to or greater than 90mph, you will receive jail time.");
              }
                else if (currentSpeed >= 80) {
                  System.out.println("Your speed is " + currentSpeed);
                  System.out.println("Your speed is less than 90mph but greater than or equal to 80mph, you are being charged for reckless driving");
              }
                else if (currentSpeed >= 70) {
                  System.out.println("Your speed is " + currentSpeed);
                  System.out.println("Your speed is less than 80mph but greater than or equal to 70mph, you are getting points taken.");

              }
                else if (currentSpeed >= 60) {
                  System.out.println("Your speed is " + currentSpeed);
                  System.out.println("Your speed is less than 70mph but greater than or equal to 60mph, you will receive a warning.");

              }
                else {
                  System.out.println("Your speed is " + currentSpeed);
                  System.out.println("Your speed is less than 60mph. Keep driving, you're are good.");
              }

            System.out.println("THE END");





        }
}
