package day08;

public class IfElseStatement {

    public static void main(String[] args) {

        int speedLimit = 60;

        int yourCurrentSpeed = 100;

        // if the yourCurrentSpeed is more than the speed limit
        // get pulled over by the police
        // given ticket by the police
        // taken away some points on your license
        // go to court

       boolean iAmSpeeding =  (yourCurrentSpeed > speedLimit) ;

        System.out.println("I am speeding: ");

        System.out.println(iAmSpeeding);

      // if(iAmSpeeding) {
       // if (true) {
        if (yourCurrentSpeed > speedLimit){
           System.out.println("get pulled over by police");
           System.out.println("given ticket by the police");
           System.out.println("taken away some points on your license");
           System.out.println("go to court");

       }
        else {
           System.out.println("go shopping!!");
           System.out.println("Buy Icecream!!");
           System.out.println("Enjoy your day!!");
       }

        System.out.println("THE END");








    }
}
