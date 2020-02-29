package day17;

public class FizzBuzzTest {

    public static void main(String[] args) {

        // if a number can be divided by both 3 and 5 it is a FizzBuzz number
        // if a number can be divided by 5 it is a Fizz number
        // if a number can be divided by 3 it is a Buzz number

        int count = 1;

        while (count <= 50) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println(count + " is a FizzBuzz number!");
            }else if (count % 3 == 0) {
                System.out.println(count + " is a Buzz number!");
            }else if (count % 5 == 0) {
                System.out.println(count + " is a Fizz number!");
            }else {
                System.out.println(count + " neither");
            }
            count ++;
        }



    }
}
