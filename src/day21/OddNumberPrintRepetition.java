package day21;

public class OddNumberPrintRepetition {

    public static void main(String[] args) {

        // Count from 1 to 10 -->> print only odd numbers
        // repeat this 4 times

        for (int i = 1; i <= 4; i++) {
            System.out.print("ITERATION : " + i);

            System.out.println();

            for (int x = 1; x < 10; x++) {

                if (x % 2 == 0) {
                    continue;
                }

                System.out.print(x + " ");


            }

            System.out.println();

        }
    }
}
