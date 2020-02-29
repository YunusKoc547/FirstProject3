package day11;

public class WarmUp1_LightOnOff {

    public static void main(String[] args) {

        String targetOption = "Bd";

        switch (targetOption) {
            case "Bd" :
                System.out.println("Turn on bedroom lights");
                break;
            case "Lr" :
                System.out.println("Turn on living room lights");
                break;
            case "Ki" :
                System.out.println("Turn on kitchen lights");
                break;
            case "Ha" :
                System.out.println("Turn on hallway lights");
                break;
            default:
                System.out.println("INVALID ENTRY");
                break;
        }

    }

}
