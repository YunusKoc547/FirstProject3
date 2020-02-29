package day20;

public class SumOfEvenOddSeparately {

    public static void main(String[] args) {

        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 10; i <= 100; i++) {
            if (i % 2 != 0) {
                sumOfOdd = sumOfOdd + i;
            }else if (i % 2 == 0) {
                sumOfEven = sumOfEven + i;
            }
        }
        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);
    }
}
