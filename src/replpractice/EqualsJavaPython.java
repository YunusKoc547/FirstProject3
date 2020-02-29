package replpractice;

import java.util.Scanner;

public class EqualsJavaPython {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int javaCount = 0;
        int pythonCount = 0;

        for (int i = 0; i < sentence.length() ; i++) {
            if (sentence.substring(i).startsWith("java")) {
                javaCount = javaCount + 1;
            }else if (sentence.substring(i).startsWith("python")) {
                pythonCount = pythonCount + 1;
            }

        }
        System.out.println(pythonCount == javaCount);

    }
}
