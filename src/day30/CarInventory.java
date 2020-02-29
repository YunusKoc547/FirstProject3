package day30;

public class CarInventory {

    public static void main(String[] args) {

        String[] carInventory = new String[] {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "BMW-7 Series",
                "Oldsmobile-Achieva",
                "Honda-Civic"};
        int chevyCount = 0;
        int civicCount = 0;

        for (String each : carInventory) {
            if (each.contains("Chevrolet")) {
                chevyCount += 1;
            }else if (each.contains("Civic")) {
                civicCount += 1;
            }
        }
        System.out.println("chevyCount = " + chevyCount);
        System.out.println("civicCount = " + civicCount);
    }
}
