package day17;

public class BackwardEvenOddNumberFinder {

    public static void main(String[] args) {

        int count = 100;

        while (count >= 0) {
            if (count % 2 == 0) {
                System.out.println(count + " is an even number");
            }else {
                System.out.println(count + " is an odd number");
            }
            count--;
        }
    }
}
