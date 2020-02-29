package replpractice;

import java.util.Scanner;

public class Methods10PrintNext3Numbers_155 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        next3(num);
    }

    public static void next3(int num) {

        Scanner inp = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            num++;
            System.out.print(num + " ");
        }

    }
}
