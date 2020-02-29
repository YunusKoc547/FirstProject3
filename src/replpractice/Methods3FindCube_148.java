package replpractice;

import java.util.Scanner;

public class Methods3FindCube_148 {

    public static void cube() {
        Scanner scan = new Scanner(System.in);
        //your code here
        int number = scan.nextInt();
        number = number * number * number;
        System.out.println(number);

    } //end cube

    public static void main(String[] args) {

        cube();

    }
}
