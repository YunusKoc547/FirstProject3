package day17;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {

        String name = "Call 1-800-Yunus";

        int x = 0;

        while (x < name.length()) {
            System.out.print("index " + x + " : ");
           System.out.println(name.charAt(x));
            ++x;
       }


    }
}
