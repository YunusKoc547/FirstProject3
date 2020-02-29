package replpractice;

public class Methods5SimplePrintPattern_150 {

    public static void printHollowRect() {

        for (int row = 1; row <= 5 ; row++) {
            for (int column = 1; column <= 5 ; column++) {
                if (row == 1 || row == 5 || column == 1 || column == 5) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        printHollowRect();
    }
}
