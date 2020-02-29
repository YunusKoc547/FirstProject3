package day12;

public class HardCoreCorollaFan_CarShopping {

    public static void main(String[] args) {

        // Buy corolla or Tesla (only if it's within the budget)

        // there is only one car covered with cloth
        // we don't know what car it is and what the price is
        // Once we take out the cloth
        // we check whether it's toyta, if it's we buy it without checking the price
        // if it's not we check if it's a Tesla and also check whether it is within the budget

        String carBrand = "corolla";
        int teslaPrice = 30000;
        int budget = 60000;

       // if (carBrand.equals("corolla") || carBrand.equals("tesla") && teslaPrice <= budget) {
          //  System.out.println("CAR ACQUIRED!!");
        //}
        //else {
            //System.out.println("NOT WHAT I AM LOOKING FOR");
        //}

        if (carBrand.equals("corolla")) {
            System.out.println("COROLLA CAR ACQUIRED!!!");
        }else if (carBrand.equals("tesla") && teslaPrice <= budget){
            System.out.println("TESLA CAR ACQUIRED!!!");
        }else {
            System.out.println("NOT WHAT I AM LOOKING FOR");
        }
    }
}
