package day31;

public class MethodPractice3 {

    public static void main(String[] args) {

        // Create a method called countDownFrom20tillOne
        // Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
        // Create a method to spell your name :  Yunus - Y - u - n - u - s
        downFrom20TillOne();
        printOddNumbers1to100();
        nameSpeller();
    }

    public static void downFrom20TillOne() {
        for (int i = 20; i >= 1 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printOddNumbers1to100() {
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void nameSpeller() {
        String name = "Yunus";
        for (int i = 0; i < name.length(); i++) {
            String both = name.charAt(i) + "-";
            System.out.print(both);
        }
        System.out.println();
    }
}
