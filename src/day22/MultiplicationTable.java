package day22;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("1 x 1 = " + 1);
        System.out.println("1 x 2 = " + 1 * 2);
        System.out.println("1 x 3 = " + 1 * 3);
        System.out.println("1 x 4 = " + 1 * 4);

        System.out.println("------------------------");

        System.out.println("Multiplication table of 1");
        for (int base = 1; base <= 12; base++) {

            System.out.println("1 x " + base + " = " + 1 * base);
        }

        System.out.println("Multiplication table of 2");
        for (int base = 1; base <= 12; base++) {

            System.out.println("2 x " + base + " = " + 2 * base);
        }

        System.out.println("Multiplication table of 3");
        for (int base = 1; base <= 12; base++) {

            System.out.println("3 x " + base + " = " + 3 * base);
        }

        for (int timesTable = 1; timesTable <= 12 ; timesTable++) {

            System.out.println("Multiplication table of " + timesTable);

            for (int base = 1; base <= 12 ; base++) {
                System.out.println(timesTable + " x " + base + " = " + timesTable * base);
            }

        }
    }
}