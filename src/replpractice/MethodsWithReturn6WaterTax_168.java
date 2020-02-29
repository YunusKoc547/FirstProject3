package replpractice;

public class MethodsWithReturn6WaterTax_168 {

    public double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        if (units <= 50) {
            bill = units * 0.6;
        }else if (units > 50 && units <= 100) {
            bill = units * 0.9;
        }else if (units > 100 && units <= 150) {
            bill = 50 + units * 0.9;
        }else if (units > 150) {
            bill = 100 + units * 0.9;
        }

        //end your code here


        return bill;
    }//end waterTax

}
