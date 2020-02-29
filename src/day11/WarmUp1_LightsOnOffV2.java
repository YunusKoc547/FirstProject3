package day11;

public class WarmUp1_LightsOnOffV2 {

    public static void main(String[] args) {

        String targetOption = "Bd";

        if (targetOption == "Bd") {
            System.out.println("Turn the on bed room lights");
        }
        else if (targetOption == "Lr") {
            System.out.println("Turn on the living room lights");
        }
        else if (targetOption == "Ki") {
            System.out.println("Turn on the kitchen lights");
        }
        else if (targetOption == "Ha") {
            System.out.println("Turn on the hallway lights");
        }
        else {
            System.out.println("INVALID ENTRY");
        }

    }

}
