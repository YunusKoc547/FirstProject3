package replpractice;

import java.util.Scanner;

public class Methods17FibonacciNumbers_162 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = first + second;
            second = first;
            first = sum;
        }
        System.out.println(sum);
    }
}
