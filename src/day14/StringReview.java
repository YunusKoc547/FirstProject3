package day14;

public class StringReview {

    public static void main(String[] args) {

        String str = "Pumpkin";

        System.out.println(str.equals("pumpkin"));

        System.out.println(str.contains("Pump"));

        // contains:
        // it checks whether a string exists in another string
        // and return true or false result

        System.out.println("Does it contain the letter P?");
        System.out.println( str.contains("P"));
                                // true
        boolean gotPumpkin = str.contains("Pumpkin");

        // shortcut to print variable in nice format
        // use "soutv"
        System.out.println("gotPumpkin = " + gotPumpkin);



        // startsWith endsWith
        // check whether a string starts with another string
        // check whether a string ends with another string
        // return true or false result

        boolean startedWithI = str.startsWith("I");
        System.out.println("started With I = " + startedWithI);

        boolean endWIthPumpkin = str.endsWith("Pumpkin");
        System.out.println("end WIth Pumpkin = " + endWIthPumpkin);






    }
}
