package day03;

public class PrimitivesPractice_IntegerType {

    public static void main(String[] args) {


        byte letterCount = 26;
        System.out.println("The letter count is " + letterCount);

        // use above example to print out the rest

        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount);

        int catCount = 20;
        System.out.println("The cat count is " + catCount);

        long miletoMoon = 50000000L;
        System.out.println("The mile count to the moon is " + miletoMoon);

        long mileToSun = 100000000L;
        System.out.println("The mile count to the sun is " + mileToSun);

        // ------floating point--------
        // you must add f ar the end of number to indicate this is float data type
        // not case sensitive, but it is mandatory
        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is " + priceOfBanana);

        float priceOfPotato = 2.49f;
        System.out.println("The price of potato is " + priceOfPotato);

        //-------- larger floating point numbers --------
        double priceOfIpad1 = 355.99d;
        System.out.println("The price of ipad is " + priceOfIpad1);

        double priceOfIpadPro = 1024.99d;
        System.out.println("The price of ipad pro is " + priceOfIpadPro);

        // compiler automatically assumes it's a double so it's not required to have a "d"
        // however for good programming habbit, always add the "d"


        double priceOfMac = 2299.99d;
        System.out.println("The price of mac is " + priceOfMac);

        // If you have a while number by itself, compiler automatically assumes that it's an int
        // If you have a fractional number by itself, compiler automatically assumes that it's a double

    }










}
