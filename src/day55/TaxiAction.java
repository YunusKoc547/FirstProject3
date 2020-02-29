package day55;

public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6",400);
        Driver d = new Driver("Pedro",12345);
        // print our first character of this driver
        System.out.println(d.name);
        
        Taxi t1 = new Taxi(101,en,d);

        System.out.println("en = " + en);
        System.out.println("t1 = " + t1);
        
        Taxi t2 = new Taxi(102,
                new Engine("V8",600),
                new Driver("John",12345));
        System.out.println("t2 = " + t2);

        Driver y = t2.dr;

        // how do I get the name of the driver using t2
        System.out.println("Driver name " + y.name);
        System.out.println("Driver name " + t2.dr.name);

        // How do I get the horse power of Taxi t2
        System.out.println("Engine horsepower is " + t2.eng.horsePower);

        // how do I get the first char of the driver name using t2
        System.out.println("Driver name " + t2.dr.name.charAt(0));


    }
}
