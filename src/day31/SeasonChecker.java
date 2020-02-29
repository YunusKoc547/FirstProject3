package day31;

public class SeasonChecker {

    public static void main(String[] args) {

        // a String variable
        // It can be accessible in main method
        String mySeason = "book";
       decideSeasonAction("Winter");
       decideSeasonAction("Summer");
       decideSeasonAction(mySeason);

    }

    public static void decideSeasonAction(String season) {
        // this season method parameter can only be accessible inside method body
        switch (season) {
            case "Spring" :
                System.out.println("Hiking");
                break;
            case "Summer" :
                System.out.println("Swimming");
                break;
            case "Fall" :
                System.out.println("Pumpkin picking");
                break;
            case "Winter" :
                System.out.println("Go Snowboarding");
                break;
            default:
                System.out.println("INVALID SEASON");
        }
    }
}
