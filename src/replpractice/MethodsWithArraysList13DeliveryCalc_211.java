package replpractice;

import java.util.ArrayList;

public class MethodsWithArraysList13DeliveryCalc_211 {

    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel)
    {
        int fuelNeed = 0;
        for (int i = 0; i < deliveries.size(); i++) {
            fuelNeed += deliveries.get(i);
        }
        int stops = (fuelNeed / max_fuel);
        if (fuelNeed % max_fuel != 0) {
            stops++;
        }
        return stops;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(6);
        int times = refuel_times(arr,3);
        System.out.print(times);//should output 5


    }//end main
}
